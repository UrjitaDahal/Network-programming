
package com.mycompany.networklab2;
import java.net.*;

public class number42 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        ds.setBroadcast(true); 
        ds.setReceiveBufferSize(32768); 
        System.out.println("Broadcast: " + ds.getBroadcast());
        System.out.println("Buffer Size: " + ds.getReceiveBufferSize());
        ds.close();
    }
}
