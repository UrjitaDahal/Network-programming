
package com.mycompany.networklab2;
import java.net.*;

public class number25 {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("www.google.com", 80);
        System.out.println("Remote Address: " + s.getInetAddress());
        System.out.println("Remote Port: " + s.getPort());
        System.out.println("Local Address: " + s.getLocalAddress());
        System.out.println("Local Port: " + s.getLocalPort());
        s.close();
    }
}
