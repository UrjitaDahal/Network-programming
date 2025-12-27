package com.mycompany.networklab2;
import java.rmi.*;

public interface GCDInterface extends Remote {
    int calculateGCD(int a, int b) throws RemoteException;
}