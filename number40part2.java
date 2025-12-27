
package com.mycompany.networklab2;
import java.net.*;
import java.util.Scanner;

public class number40part2 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter message: ");
        byte[] buf = sc.nextLine().getBytes();
        ds.send(new DatagramPacket(buf, buf.length, InetAddress.getByName("localhost"), 5000));
    }
}
