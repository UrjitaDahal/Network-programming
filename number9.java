
package com.mycompany.networklab2;
import java.net.*;
import java.util.*;

public class number9 {
    public static void main(String[] args) throws Exception {
        // Factory Method: getByName
        NetworkInterface ni = NetworkInterface.getByName("eth0");
        if (ni == null) ni = NetworkInterface.getNetworkInterfaces().nextElement();

        // Getter Methods
        System.out.println("Display Name: " + ni.getDisplayName());
        System.out.println("Name: " + ni.getName());
        System.out.println("MTU: " + ni.getMTU());
        System.out.println("Is Up: " + ni.isUp());
        System.out.println("Hardware Address: " + Arrays.toString(ni.getHardwareAddress()));
    }
}
