
package com.mycompany.networklab2;
import java.net.*;

public class number13 {
    public static void main(String[] args) throws Exception {
        URI uri = new URI("mailto:java-net@java.sun.com");
        System.out.println("Scheme: " + uri.getScheme());
        System.out.println("Scheme-specific part: " + uri.getSchemeSpecificPart());
        System.out.println("Is Absolute: " + uri.isAbsolute());
        System.out.println("Is Opaque: " + uri.isOpaque());
    }
}
