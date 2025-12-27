
package com.mycompany.networklab2;
import java.net.*;
public class number43 {
    public static void main(String[] args) throws Exception {
        InetAddress group = InetAddress.getByName("224.0.0.1");
        MulticastSocket ms = new MulticastSocket(4446);
        ms.joinGroup(group);
        System.out.println("Joined Multicast Group 224.0.0.1");
        ms.leaveGroup(group);
        ms.close();
    }
}
