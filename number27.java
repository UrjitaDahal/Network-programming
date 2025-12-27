
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
import java.util.Date;

public class number27 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(1313);
        while (true) {
            try (Socket s = ss.accept()) {
                PrintWriter out = new PrintWriter(s.getOutputStream(), true);
                out.println(new Date().toString());
            }
        }
    }
}
