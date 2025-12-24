
package com.mycompany.networklab2;

import java.net.*;
public class number12 {
    public static void main(String[] args) {
        String[] protocols = {"http", "https", "ftp", "mailto", "telnet", "file", "gopher", "ldap"};
        for (String p : protocols) {
            try {
                URL u = new URL(p, "localhost", "/");
                System.out.println(p + " is supported.");
            } catch (MalformedURLException ex) {
                System.out.println(p + " is NOT supported.");
            }
        }
    }
}
