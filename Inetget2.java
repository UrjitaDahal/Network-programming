package com.mycompany.networkclass;
import java.net.*;
public class Inetget2 {
     public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Urjita Dahal");
            System.out.println("Host Name: " + address.getHostName());
            System.out.println("Canonical Host Name: " + address.getCanonicalHostName());
            System.out.println("Host Address: " + address.getHostAddress());
            System.out.println("Is Any Local Address: " + address.isAnyLocalAddress());
            System.out.println("Is Loopback Address: " + address.isLoopbackAddress());
        } catch (UnknownHostException e) {
            System.out.println("Unable to find local host.");
        }
    }
}
