
package com.mycompany.networklab2;

import java.net.*;
import java.nio.*;
import java.nio.channels.*;
import java.util.*;
public class number37part1 {
            public static void main(String[] args) throws Exception {
        Selector selector = Selector.open();
        ServerSocketChannel serverChannel = ServerSocketChannel.open();
        serverChannel.bind(new InetSocketAddress("localhost", 9999));
        serverChannel.configureBlocking(false);
        serverChannel.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("NIO Server started on 9999...");
        while (true) {
            selector.select();
            Iterator<SelectionKey> iter = selector.selectedKeys().iterator();
            while (iter.hasNext()) {
                SelectionKey key = iter.next();
                
                if (key.isAcceptable()) {
                    SocketChannel client = serverChannel.accept();
                    client.configureBlocking(false);
                    client.register(selector, SelectionKey.OP_READ);
                    System.out.println("Accepted connection from: " + client.getRemoteAddress());
                } 
                else if (key.isReadable()) {
                    SocketChannel client = (SocketChannel) key.channel();
                    ByteBuffer buffer = ByteBuffer.allocate(256);
                    int bytesRead = client.read(buffer);

                    if (bytesRead == -1) {
                        
                        System.out.println("Closing connection...");
                        client.close();
                    } else {
                        String msg = new String(buffer.array()).trim();
                        if (!msg.isEmpty()) {
                            System.out.println("Received: " + msg);
                        }
                    }
                }
                iter.remove();
            }
        }
    }
}
