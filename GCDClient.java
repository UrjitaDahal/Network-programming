package com.mycompany.networklab2;
import java.rmi.*;
//number45:
public class GCDClient {
    public static void main(String[] args) {
        try {
            
            GCDInterface stub = (GCDInterface) Naming.lookup("rmi://localhost/GCDService");
            
            int num1 = 48, num2 = 18;
            int result = stub.calculateGCD(num1, num2);
            
            System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + result);
        } catch (Exception e) {
            System.out.println("Client Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}