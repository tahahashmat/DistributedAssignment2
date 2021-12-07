/*
Taha Hashmat - 100689792
Assignment 2 - Distributed Systems
10th November 2021
 */

import java.rmi.Remote;
import java.rmi.RemoteException;


public interface HealthTrackInterface extends Remote {

    //Method 1: function that calculates a users Body Mass Index using the metric system
    double BMIkg (double weight, double height) throws  RemoteException;

    //Method 2: function that calculates a users Body Mass Index using the imperial system
    double BMIlb (double weight, double height) throws RemoteException;

    //Method 3: function that calculates a users Basal Metabolic Rate using the metric system
    double BMRkg (double weight, double height, int age, int gender) throws  RemoteException;

    //Method 4: function that calculates a users Basal Metabolic Rate using the imperial system
    double BMRlb (double weight, double height, int age, int gender) throws  RemoteException;

    //Method 5: function that gives the user feedback on daily physical activity with measurements in the metric system
    String exLevelKg (double weight, double height, int age, int gender) throws  RemoteException;

    //Method 6: function that gives the user feedback on daily physical activity with measurements in the imperial system
    String exLevelLb (double weight, double height, int age, int gender) throws  RemoteException;



}
