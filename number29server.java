
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;

public class number29server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());
        DataOutputStream out = new DataOutputStream(s.getOutputStream());
        int num = in.readInt();
        long fact = 1;
        for (int i = 1; i <= num; i++) fact *= i;
        out.writeLong(fact);
    }
}
