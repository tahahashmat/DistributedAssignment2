/*
Taha Hashmat - 100689792
Assignment 2 - Distributed Systems
10th November 2021
 */

import java.rmi.Naming;
import java.rmi.*;


//implementing server side code

public class HealthServer {
    public static void main(String argv[]) {
        if(System.getSecurityManager() == null) {
            System.setSecurityManager(new SecurityManager());
        }
        try {
            HealthTrackInterface hi = new HealthTrackImpl("HealthServer");
            Naming.rebind("//127.0.0.1/HealthServer", hi);
            //print message to confirm server is running
            System.out.println("Server Ready - service is running...");
        } catch(Exception e) {
            System.out.println("HealthServer: "+e.getMessage());
            e.printStackTrace();
        }
    }
}

