
package com.mycompany.networklab2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;


public class number10 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.google.com");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
}
