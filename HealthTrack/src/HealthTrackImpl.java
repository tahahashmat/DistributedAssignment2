/*
Taha Hashmat - 100689792
Assignment 2 - Distributed Systems
10th November 2021
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HealthTrackImpl extends UnicastRemoteObject implements HealthTrackInterface{

    protected HealthTrackImpl(String test) throws RemoteException {
    }

    //function that calculates a users Body Mass Index using the metric system
    //using the formula body/(height)^2
    @Override
    public double BMIkg(double weight, double height) throws RemoteException {
        double mheight = height * 0.01;
        double BMIkg;
        BMIkg = (weight/mheight/mheight);
        return BMIkg;
    }
    //function that calculates a users Body Mass Index using the imperial system
    //using the formula body/(height)^2
    @Override
    public double BMIlb(double weight, double height) throws RemoteException {
        double kgweight = weight / 2.20462;
        double mheight = height * 0.0254;
        double BMI;

        BMI = (kgweight/mheight/mheight);
        return BMI;

    }
    //function that calculates a users Basal Metabolic Rate using the metric system
    //different formulas for men and women, using an if statement to differentiate between user input
    @Override
    public double BMRkg(double weight, double height, int age, int gender) throws RemoteException {
        double BMR;

        if (gender == 1){

            double BMRweight = 13.397 * weight;
            double BMRheight = 4.799 * height;
            double BMRage = 5.677 * age;

            BMR = 88.362 + BMRweight + BMRheight - BMRage;

            return BMR;
        }
        else if (gender == 2) {

            double BMRweight = 9.247 * weight;
            double BMRheight = 3.098 * height;
            double BMRage = 4.330 * age;

            BMR = 447.593 + BMRweight + BMRheight - BMRage;

            return BMR;
        }

        else{
            System.out.println("Incorrect Entry");
            return 0;
        }

    }

    //function that calculates a users Basal Metabolic Rate using the imperial system
    //different formulas for men and women, using an if statement to differentiate between user input
    @Override
    public double BMRlb(double weight, double height, int age, int gender) throws RemoteException {
        double BMR;
        double kgweight = weight / 2.20462;
        double cmheight = height * 2.54;


        if (gender == 1){

            double BMRweight = 13.397 * kgweight;
            double BMRheight = 4.799 * cmheight;
            double BMRage = 5.677 * age;

            BMR = 88.362 + BMRweight + BMRheight - BMRage;

            return BMR;
        }
        else if (gender == 2) {

            double BMRweight = 9.247 * kgweight;
            double BMRheight = 3.098 * cmheight;
            double BMRage = 4.330 * age;

            BMR = 447.593 + BMRweight + BMRheight - BMRage;

            return BMR;
        }

        else{
            System.out.println("Incorrect Entry");
            return 0;
        }

    }

    //function that gives the user feedback on daily physical activity with measurements in the metric system
    //calculates the users BMR and uses an if statement to compare their BMR with daily calorie intake in accordance with their physicality
    public String exLevelKg(double weight, double height, int age, int gender) throws RemoteException {
        double BMR;

            if (gender == 1) {

                double BMRweight = 13.397 * weight;
                double BMRheight = 4.799 * height;
                double BMRage = 5.677 * age;

                BMR = 88.362 + BMRweight + BMRheight - BMRage;
            } else if (gender == 2){
                double BMRweight = 9.247 * weight;
                double BMRheight = 3.098 * height;
                double BMRage = 4.330 * age;

                BMR = 447.593 + BMRweight + BMRheight - BMRage;
            }
            else{
                return ("Incorrect Input");
            }

            if (BMR >= 3050){
                return ("Very intense exercise daily, or physical job");
            }
            else if (BMR >= 2769){
                return ("Intense exercise 6-7 times/week");
            }
            else if (BMR >= 2488){
                return ("Daily exercise or intense exercise 3-4 times/week");
            }
            else if (BMR >= 2351){
                return ("Exercise 4-5 times/week");
            }
            else if (BMR >= 2207){
                return ("Exercise 1-3 times/week");
            }
            else{
                return("Sedentary: little or no exercise\t");
            }

        }

    //function that gives the user feedback on daily physical activity with measurements in the imperial system
    //calculates the users BMR and uses an if statement to compare their BMR with daily calorie intake in accordance with their physicality
    public String exLevelLb(double weight, double height, int age, int gender) throws RemoteException {
        double BMR;
        double kgweight = weight / 2.20462;
        double cmheight = height * 2.54;

        if (gender == 1) {

            double BMRweight = 13.397 * kgweight;
            double BMRheight = 4.799 * cmheight;
            double BMRage = 5.677 * age;

            BMR = 88.362 + BMRweight + BMRheight - BMRage;
        } else if (gender == 2){
            double BMRweight = 9.247 * kgweight;
            double BMRheight = 3.098 * cmheight;
            double BMRage = 4.330 * age;

            BMR = 447.593 + BMRweight + BMRheight - BMRage;
        }

        else{
            return ("Incorrect Input");
        }

        if (BMR >= 3050){
                return ("Very intense exercise daily, or physical job");
        }
        else if (BMR >= 2769){
            return ("Intense exercise 6-7 times/week");
        }
        else if (BMR >= 2488){
            return ("Daily exercise or intense exercise 3-4 times/week");
        }
        else if (BMR >= 2351){
            return ("Exercise 4-5 times/week");
        }
        else if (BMR >= 2207){
            return ("Exercise 1-3 times/week");
        }
        else{
            return("Sedentary: little or no exercise\t");
        }

    }
}
