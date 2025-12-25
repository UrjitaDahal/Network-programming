
package com.mycompany.networklab2;
import java.net.*;

public class number23 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com");
        URLConnection uc = u.openConnection();
        uc.setDoInput(true);
        uc.setConnectTimeout(5000);
        uc.setReadTimeout(5000);
        uc.setRequestProperty("User-Agent", "Mozilla/5.0");
        System.out.println("URLConnection configured.");
    }
}
