package com.mycompany.networkclass;
import java.net.*;
public class Check3 {
    public static void main(String[] args) {
        System.out.println("Urjita Dahal");
        try{
          
            //no 3:
             // Link-local address
             InetAddress linkLocal = InetAddress.getByName("169.254.1.5");
            System.out.println("check link local address: ");
            System.out.println(linkLocal.isLinkLocalAddress());
            
             // Site-local address
             InetAddress siteLocal = InetAddress.getByName("192.168.1.1");
            System.out.println("check site local address: ");
            System.out.println(siteLocal.isSiteLocalAddress());
            
             // Multicast address 
              InetAddress multicast = InetAddress.getByName("224.0.0.5");
            System.out.println("check multicast address: ");
            System.out.println(multicast.isMulticastAddress());
            
            // Multicast global
            InetAddress mcGlobal = InetAddress.getByName("233.252.0.0");
            System.out.println("check multicast global address: ");
            System.out.println(mcGlobal.isMCGlobal());
            
             // Multicast node-local
             InetAddress mcNodeLocal = InetAddress.getByName("224.0.0.1");
            System.out.println("check multicast node local address: ");
            System.out.println(mcNodeLocal.isMCNodeLocal());
            
             // Multicast link-local 
              InetAddress mcLinkLocal = InetAddress.getByName("224.0.0.2");
            System.out.println("check multicast link local address: ");
            System.out.println(mcLinkLocal.isMCLinkLocal());
            
             // Multicast site-local
             InetAddress mcSiteLocal = InetAddress.getByName("239.255.1.1");
            System.out.println("check multicast site local address: ");
            System.out.println(mcSiteLocal.isMCSiteLocal());
            
            // Multicast organization-local 
             InetAddress mcOrgLocal = InetAddress.getByName("239.192.1.1");
            System.out.println("check multicast org local address: ");
            System.out.println(mcOrgLocal.isMCOrgLocal());    
        }
        catch(UnknownHostException ex){
        System.out.println("dont know address sorry.host lookup also fail "); 
        }
    }
}
 //checking loopback address:
         /* InetAddress lhost = InetAddress.getByName("127.0.0.1"); 
            System.out.println("check loopback address: ");
            System.out.println(lhost.isLoopbackAddress());
            
            //check local address any:
            InetAddress lhost2 = InetAddress.getByName("0.0.0.0"); 
            System.out.println("check any local address: ");
            System.out.println(lhost2.isAnyLocalAddress());
            
            //check inet address objects:
            
            InetAddress ibiblio = InetAddress.getByName("tu.edu.np");
            InetAddress helios= InetAddress.getByName("pmc.tu.edu.np");
            if(ibiblio.equals(helios)){
                System.out.println("both are the same");
            }else{
                System.out.println("both are not the same");
            }*/
