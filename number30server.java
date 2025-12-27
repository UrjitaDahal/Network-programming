
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;

public class number30server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6000);
        System.out.println("Server ready to share file...");
        Socket s = ss.accept();

        File file = new File("number30test.txt");
        byte[] bytes = new byte[(int) file.length()];
        
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        bis.read(bytes, 0, bytes.length);
        
        OutputStream os = s.getOutputStream();
        os.write(bytes, 0, bytes.length);
        os.flush();
        
        System.out.println("File sent successfully.");
        s.close();
        ss.close();
    }
}
