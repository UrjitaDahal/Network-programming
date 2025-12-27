
package com.mycompany.networklab2;
import java.net.*;
import java.util.Date;

public class number39part1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(1313);
        while(true) {
            byte[] buf = new byte[256];
            DatagramPacket req = new DatagramPacket(buf, buf.length);
            ds.receive(req);
            byte[] time = new Date().toString().getBytes();
            ds.send(new DatagramPacket(time, time.length, req.getAddress(), req.getPort()));
        }
    }
}
