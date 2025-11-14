package com.mycompany.networkclass;
import java.net.*;
import java.util.*;

public class retriveipInterface7 {
     public static void main(String[] args) {
        try {
           
            NetworkInterface ni = NetworkInterface.getByName("wireless_32768");
            if (ni == null) {
                System.out.println("Interface not found.");
                return;
            }

            Enumeration<InetAddress> addresses = ni.getInetAddresses();
            while (addresses.hasMoreElements()) {
                InetAddress addr = addresses.nextElement();
                System.out.println("IP Address for " + ni.getName() + ": " + addr.getHostAddress());
            }
        } catch (SocketException e) {
            System.out.println("Error retrieving interface details.");
        }
    }
   /* public static void main(String[] args) throws Exception {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
        while (nets.hasMoreElements()) {
            NetworkInterface ni = nets.nextElement();
            System.out.println("Name: " + ni.getName());
            System.out.println("Display Name: " + ni.getDisplayName());
            System.out.println("-----------------------------------");
        }
    }*/
}
