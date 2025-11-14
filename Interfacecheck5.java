package com.mycompany.networkclass;
import java.net.*;
import java.util.*;

public class Interfacecheck5 {
   public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                NetworkInterface ni = interfaces.nextElement();
                System.out.println("Interface Name: " + ni.getName());
                System.out.println("Display Name: " + ni.getDisplayName());
                System.out.println("--------------------------------");
            }
        } catch (SocketException e) {
            System.out.println("Error retrieving network interfaces.");
        }
    }  
}
