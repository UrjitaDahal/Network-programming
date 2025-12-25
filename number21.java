
package com.mycompany.networklab2;
import java.net.*;
import java.io.*;

public class number21 {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.google.com");
        URLConnection uc = u.openConnection();
        String contentType = uc.getContentType();
        String encoding = "UTF-8"; // default
        if (contentType != null && contentType.contains("charset=")) {
            encoding = contentType.split("charset=")[1];
        }
        
        InputStream in = new BufferedInputStream(uc.getInputStream());
        Reader r = new InputStreamReader(in, encoding);
        int c;
        while ((c = r.read()) != -1) System.out.print((char) c);
    }
}
