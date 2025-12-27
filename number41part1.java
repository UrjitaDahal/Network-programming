
package com.mycompany.networklab2;

import java.net.*;
public class number41part1 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(6000);
        while(true) {
            byte[] buf = new byte[1024];
            DatagramPacket p = new DatagramPacket(buf, buf.length);
            ds.receive(p);
            int n = Integer.parseInt(new String(p.getData(), 0, p.getLength()).trim());
            int sum = 0, temp = n;
            while(temp > 0) { int r = temp % 10; sum += (r*r*r); temp /= 10; }
            String res = (sum == n) ? "Armstrong" : "Not Armstrong";
            ds.send(new DatagramPacket(res.getBytes(), res.length(), p.getAddress(), p.getPort()));
        }
    }
}
