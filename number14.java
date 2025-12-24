
package com.mycompany.networklab2;

import java.net.*;
public class number14 {
    public static void main(String[] args) throws Exception {
        String query = "search query with spaces & symbols";
        String encoded = URLEncoder.encode(query, "UTF-8");
        System.out.println("Encoded: " + encoded);
    }
}

