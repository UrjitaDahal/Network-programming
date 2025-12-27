
package com.mycompany.networklab2;
import java.net.*;

public class number39part2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] buf = new byte[1];
        ds.send(new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 1313));
        DatagramPacket res = new DatagramPacket(new byte[256], 256);
        ds.receive(res);
        System.out.println("Time: " + new String(res.getData()).trim());
    }
}
