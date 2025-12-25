
package com.mycompany.networklab2;
import java.net.*;
import java.io.*;

public class number24 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("http://www.google.com");
        URLConnection uc = u.openConnection();
        try (InputStream in = uc.getInputStream();
             FileOutputStream out = new FileOutputStream("download.html")) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("Webpage downloaded.");
    }
}
