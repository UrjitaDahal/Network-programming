
package com.mycompany.networklab2;

import java.net.*;
public class number19 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com");
        URLConnection uc = u.openConnection();
        System.out.println("Content-type: " + uc.getContentType());
        System.out.println("Content-encoding: " + uc.getContentEncoding());
        System.out.println("Date: " + uc.getDate());
        System.out.println("Expiration: " + uc.getExpiration());
        System.out.println("Last modified: " + uc.getLastModified());
    }
}
