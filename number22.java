
package com.mycompany.networklab2;
import java.net.*;
import java.util.*;
public class number22 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com");
        URLConnection uc = u.openConnection();
        Map<String, List<String>> headers = uc.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
