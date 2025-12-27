
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;

public class number31 {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket s = ss.accept();
            new Thread(() -> {
                try {
                    DataInputStream in = new DataInputStream(s.getInputStream());
                    int n = in.readInt();
                    boolean isPrime = n > 1;
                    for (int i = 2; i <= Math.sqrt(n); i++) if (n % i == 0) isPrime = false;
                    new DataOutputStream(s.getOutputStream()).writeBoolean(isPrime);
                    s.close();
                } catch (Exception e) {}
            }).start();
        }
    }
}
