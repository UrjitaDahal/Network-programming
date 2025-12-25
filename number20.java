
package com.mycompany.networklab2;
import java.net.*;

public class number20 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com");
        URLConnection uc = u.openConnection();
        for (int j = 1; ; j++) {
            String header = uc.getHeaderField(j);
            if (header == null) break;
            System.out.println(uc.getHeaderFieldKey(j) + ": " + header);
        }
    }
}
