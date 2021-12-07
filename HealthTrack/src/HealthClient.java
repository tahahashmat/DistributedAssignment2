/*
Taha Hashmat - 100689792
Assignment 2 - Distributed Systems
10th November 2021
 */

import java.rmi.Naming;
import java.io.*;
import java.rmi.*;
import java.util.Random;
import java.util.*;


public class HealthClient {
    public static void main(String argv[]) {
        try {
            System.out.println("Client Ready - remote stub active...");
            String name = "//" + argv[0] + "/HealthServer";

            //creating interface object to call remote methods
            HealthTrackInterface hi = (HealthTrackInterface) Naming.lookup(name);

            //intro to the application and its functionality explained to the user

            System.out.println("\nWelcome to HealthTrack, an application which offers you calculation based health services");
            System.out.println("Our services currently include calculating a users BMI, BMR and advising them on their daily exercise needs");
            System.out.println("Please follow the instructions below \n");

            //infinite while loop to keep the program running until user termination
            while(true){
                System.out.println("\nWhich of our services would you like to access?");
                System.out.println("\n1. BMI Calculator");
                System.out.println("2. BMR Calculator");
                System.out.println("3. Daily Required Exercise Level");

                System.out.println("\nPlease type in either 1, 2 or 3 in the following prompt. Enter 0 to Exit!");
                Scanner scan = new Scanner(System.in);
                int input = scan.nextInt();

                // user given option to terminate upon entering the option 0 in one of the prompts
                if (input == 0){
                    break;
                }

                //asking the user to choose between the metric and imperial system
                System.out.println("\nNow please choose between a measurement system for your preferred units. ");
                System.out.println("\n1. Metric System");
                System.out.println("2. Imperial System");
                System.out.println("\nType in either 1 or 2 in the following prompt:");
                int unitInput = scan.nextInt();

                // nested if statements which ask the user questions based on their input

                // for bmi calculation using metric system
                if (input == 1 && unitInput == 1){
                    System.out.println("\nPlease enter your weight in kilograms: ");
                    double weight = scan.nextDouble();
                    System.out.println("Please enter your height in centimeters: ");
                    double height = scan.nextDouble();

                    // call to BMIkg method from Impl file using created object
                    double finalBMI = hi.BMIkg(weight, height);

                    System.out.println("\nYour BMI is: " + finalBMI);

                }

                // for bmi calculation using imperial system
                else if (input == 1 && unitInput == 2){
                    System.out.println("\nPlease enter your weight in pounds: ");
                    double weight = scan.nextDouble();
                    System.out.println("Please enter your height in inches: ");
                    double height = scan.nextDouble();

                    // call to BMIkg method from Impl file using created object
                    double finalBMI = hi.BMIlb(weight, height);

                    System.out.println("\nYour BMI is: " + finalBMI);

                }

                // for bmr calculation using metric system
                else if (input == 2 && unitInput == 1){
                    System.out.println("\nPlease enter your weight in kilograms: ");
                    double weight = scan.nextDouble();
                    System.out.println("Please enter your height in centimeters: ");
                    double height = scan.nextDouble();
                    System.out.println("Please enter your age in years: ");
                    int age = scan.nextInt();
                    System.out.println("Please enter your gender (1 for Male or 2 for Women): ");
                    int gender = scan.nextInt();

                    // call to BMRkg method from Impl file using created object
                    double finalBMR = hi.BMRkg(weight, height, age, gender);

                    System.out.println("\nYour BMR is: " + finalBMR + " calories");

                }

                // for bmr calculation using imperial system
                else if (input == 2 && unitInput == 2){
                    System.out.println("\nPlease enter your weight in pounds: ");
                    double weight = scan.nextDouble();
                    System.out.println("Please enter your height in inches: ");
                    double height = scan.nextDouble();
                    System.out.println("Please enter your age in years: ");
                    int age = scan.nextInt();
                    System.out.println("Please enter your gender (1 for Male or 2 for Women): ");
                    int gender = scan.nextInt();

                    // call to BMRlb method from Impl file using created object
                    double finalBMR = hi.BMRlb(weight, height, age, gender);

                    System.out.println("\nYour BMR is: " + finalBMR + " calories");
                }

                // for daily physical activity advise using metric system
                else if (input == 3 && unitInput == 1){
                    System.out.println("\nPlease enter your weight in kilograms: ");
                    double weight = scan.nextDouble();
                    System.out.println("Please enter your height in centimeters: ");
                    double height = scan.nextDouble();
                    System.out.println("Please enter your age in years: ");
                    int age = scan.nextInt();
                    System.out.println("Please enter your gender (1 for Male or 2 for Women): ");
                    int gender = scan.nextInt();

                    // call to exLevelKg method from Impl file using created object
                    String output = hi.exLevelKg(weight, height, age, gender);
                    System.out.println("\n");
                    System.out.println(output);

                }

                // for daily physical activity advise using imperial system
                else if (input == 3 && unitInput == 2){
                    System.out.println("\nPlease enter your weight in pounds: ");
                    double weight = scan.nextDouble();
                    System.out.println("Please enter your height in inches: ");
                    double height = scan.nextDouble();
                    System.out.println("Please enter your age in years: ");
                    int age = scan.nextInt();
                    System.out.println("Please enter your gender (1 for Male or 2 for Women):");
                    int gender = scan.nextInt();

                    // call to exLevelLb method from Impl file using created object
                    String output = hi.exLevelLb(weight, height, age, gender);
                    System.out.println("\n");
                    System.out.println(output);

                }
                //In case of incorrect option selection
                else{
                    System.out.print("Incorrect Input");
                    break;
                }

            }

        //Mandatory catch clause
        } catch(Exception e) {
            System.err.println("FileServer exception: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
