package com.mycompany.networkclass;
import java.net.*;

public class Retrivemac8 {
     public static void main(String[] args) throws Exception {
        try {
            // Enter a valid IP address on your network
            InetAddress addr = InetAddress.getByName("192.168.1.65");
            NetworkInterface ni = NetworkInterface.getByInetAddress(addr);

            if (ni == null) {
                System.out.println("No interface found for IP: " + addr);
                return;
            }

            byte[] mac = ni.getHardwareAddress();
            if (mac != null) {
                System.out.print("MAC Address for " + addr + ": ");
                for (int i = 0; i < mac.length; i++) {
                    System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                }
                System.out.println();
            } else {
                System.out.println("MAC Address not available for this IP.");
            }
        } catch (Exception e) {
            System.out.println("Error retrieving MAC address.");
        }
    }
}
  