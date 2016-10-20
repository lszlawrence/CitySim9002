/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import domain.Validator;

import java.util.Random;

import java.lang.Integer;
/**
 *
 * @author AsphaltPanthers Shizheng Li
 *
 */



public class CitySim9002 {
    // Initialize game, show the seed
    public static String errorMessage = "Please enter one integer argument, seed";

    public static void main(String[] args) {
        int seed = 0;
        Validator validator = new Validator();

        //determine if the input is validate, if not, print the error message
        if (validator.validateArguments(args)) {
            seed = Integer.parseInt(args[0]);
            Random rand = new Random(seed);
            System.out.println("Welcome to CitySim! Your seed is " + seed + "." );
            for(int i=1; i<=5; ++i){

                //use random index to randomly generate visitor type
                Visitor visitor = new Visitor();
                String visitorType = visitor.vistorGenerator(rand);
                //print out user type
                System.out.println("Visitor " + i + " is a " + visitorType + "!");

                //randomly generate the destination visitor is going to
                int index = rand.nextInt(4);
                while(index !=4){
                    Location location = new Location();
                    String locations = location.locationGenerator(rand);
                    System.out.println("Visitor " + i + " is going to " + locations + "!");

                    //determine if the visitor like the destination and print the preference
                    if(new Preference().like(locations, visitorType)){
                        System.out.println("Visitor " + i + " did like " + locations + "." );
                    } else{
                        System.out.println("Visitor " + i + " did not like " + locations + "." );
                    }
                    //renew index
                    index = rand.nextInt(4) + 1;
                }
                //when the random generator generates 4, let the visitor left the city
                System.out.println("Visitor " + i + " has left the city.");
                System.out.println("***");
            }
        }
        else {

            System.out.println(errorMessage);

        }


    }
}




















