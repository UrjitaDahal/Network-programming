package com.mycompany.networklab2;
import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;

public class GCDServer extends UnicastRemoteObject implements GCDInterface {
    public GCDServer() throws RemoteException { super(); }

    public int calculateGCD(int a, int b) throws RemoteException {
        if (b == 0) return a;
        return calculateGCD(b, a % b);
    }

    public static void main(String[] args) {
        try {
            
            LocateRegistry.createRegistry(1099);
            
            GCDServer server = new GCDServer();
            Naming.rebind("rmi://localhost/GCDService", server);
            
            System.out.println("GCD RMI Server is running...");
        } catch (Exception e) {
            System.out.println("Server Error: " + e.getMessage());
        }
    }
}