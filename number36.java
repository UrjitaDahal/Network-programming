
package com.mycompany.networklab2;
import java.net.*;
public class number36 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(0);
        System.out.println("Local port: " + ds.getLocalPort());
        System.out.println("Receive Buffer Size: " + ds.getReceiveBufferSize());
        ds.close();
    }
}
