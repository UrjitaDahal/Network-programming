package com.mycompany.networkclass;
import java.net.*;
import java.util.*;
public class Networkinterface9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Urjita Dahal");

      
        InetAddress lhost = InetAddress.getByName("192.168.1.65");
        NetworkInterface ni = NetworkInterface.getByInetAddress(lhost);

        if (ni == null) {
            System.out.println("No local loopback interface found.");
        } else {
            System.out.println("Factory Method Result:");
            System.out.println("Display Name: " + ni.getDisplayName());
            System.out.println("Name: " + ni.getName());
            System.out.println("Is Up: " + ni.isUp());
            System.out.println("Supports Multicast: " + ni.supportsMulticast());
            System.out.println("Loopback: " + ni.isLoopback());
            System.out.println("Virtual: " + ni.isVirtual());
            System.out.println();
        }
        
        System.out.println("List of all Network Interfaces:");
        Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
        while (interfaces.hasMoreElements()) {
            NetworkInterface netIf = interfaces.nextElement();
            System.out.println("---------------------------------");
            System.out.println("Interface Name: " + netIf.getName());
            System.out.println("Display Name: " + netIf.getDisplayName());
            System.out.println("Is Up: " + netIf.isUp());
            System.out.println("Supports Multicast: " + netIf.supportsMulticast());
            System.out.println("Loopback: " + netIf.isLoopback());
        }
    }
}
