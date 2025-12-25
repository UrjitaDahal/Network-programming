
package com.mycompany.networklab2;

import java.net.*;
public class number17 implements CookiePolicy {
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        return !uri.getHost().toLowerCase().endsWith(".gov");
    }

    public static void main(String[] args) {
        CookieManager cm = new CookieManager(null, new number17());
        CookieHandler.setDefault(cm);
        System.out.println("Cookie policy set to block .gov domains.");
    }
}
