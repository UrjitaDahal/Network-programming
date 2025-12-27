
package com.mycompany.networklab2;

import com.sun.net.httpserver.*;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.file.Files;
public class number34 {
   public static void main(String[] args) throws IOException {
        
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        
       
        server.createContext("/viewfile", new HttpHandler() {
            @Override
            public void handle(HttpExchange exchange) throws IOException {
                
                File file = new File("test34.txt");
                
                if (file.exists()) {
                    byte[] response = Files.readAllBytes(file.toPath());
                    exchange.sendResponseHeaders(200, response.length);
                    OutputStream os = exchange.getResponseBody();
                    os.write(response);
                    os.close();
                } else {
                    String error = "Error: test.txt not found on server.";
                    exchange.sendResponseHeaders(404, error.length());
                    OutputStream os = exchange.getResponseBody();
                    os.write(error.getBytes());
                    os.close();
                }
            }
        });

        server.setExecutor(null); 
        System.out.println("Server started. Visit http://localhost:8000/viewfile");
        server.start();
    }
}
