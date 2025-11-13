package com.mycompany.networkclass;
import java.net.*;
public class q4 {
    public static void main(String[] args) { 
      try {
          
         InetAddress me = InetAddress.getLocalHost();
        /* String dottedquad =me.getHostAddress();
           String hn=me.getHostName();
           System.out.println("Urjita Dahal");
           System.out.println("Myaddress "+dottedquad);
           System.out.println("my name "+hn);*/
           
           //q4:
           System.out.println("Urjita Dahal");
         byte[] m = me.getAddress();
           if(m.length ==4) 
               System.out.println("it is ipv4");
    else {System.out.println("ip address is ipv6");}
       }
      
       catch(UnknownHostException ex){
           System.out.println("dont know address sorry"); 
       }
    }
    
}
