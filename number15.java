
package com.mycompany.networklab2;
import java.net.*;

public class number15 {
    public static void main(String[] args) throws Exception {
        String encoded = "search+query+with+spaces+%26+symbols";
        String decoded = URLDecoder.decode(encoded, "UTF-8");
        System.out.println("Decoded: " + decoded);
    }
}
