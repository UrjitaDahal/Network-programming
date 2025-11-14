package com.mycompany.networkclass;
import java.net.*;

public class Ipmac6 {
         public static void main(String[] args) throws Exception {
        InetAddress localHost = InetAddress.getLocalHost();
        NetworkInterface ni = NetworkInterface.getByInetAddress(localHost);
             System.out.println("Urjita Dahal");
        System.out.println("IP Address: " + localHost.getHostAddress());

        byte[] mac = ni.getHardwareAddress();
        if (mac != null) {
            System.out.print("MAC Address: ");
            for (int i = 0; i < mac.length; i++) {
                System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
            }
            System.out.println();
        } else {
            System.out.println("MAC Address not found.");
        }
    }
}
