
package com.mycompany.networklab2;
import java.io.*;
import java.net.*;
public class number30client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 6000);
        
        byte[] bytes = new byte[1024];
        InputStream is = s.getInputStream();
        FileOutputStream fos = new FileOutputStream("received_file.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        
        int bytesRead;
        while ((bytesRead = is.read(bytes)) != -1) {
            bos.write(bytes, 0, bytesRead);
        }
        
        bos.close();
        System.out.println("File received and saved as 'received_file.txt'");
        s.close();
    }
}
