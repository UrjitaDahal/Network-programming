
package com.mycompany.networklab2;

import java.net.*;
import java.util.Scanner;
public class number41part2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        System.out.print("Enter number: ");
        byte[] buf = new Scanner(System.in).nextLine().getBytes();
        ds.send(new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 6000));
        DatagramPacket res = new DatagramPacket(new byte[1024], 1024);
        ds.receive(res);
        System.out.println("Result: " + new String(res.getData()).trim());
    }
}
