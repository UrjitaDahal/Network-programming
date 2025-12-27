
package com.mycompany.networklab2;
import java.net.*;

public class number38part2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] msg = "Echo Test".getBytes();
        DatagramPacket p = new DatagramPacket(msg, msg.length, InetAddress.getByName("localhost"), 7000);
        ds.send(p);
        byte[] rec = new byte[1024];
        DatagramPacket response = new DatagramPacket(rec, rec.length);
        ds.receive(response);
        System.out.println("Server echoed: " + new String(response.getData(), 0, response.getLength()));
    }
}
