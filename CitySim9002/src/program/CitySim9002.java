/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import domain.Validator;

import java.util.Random;

/**
 *
 * @author AsphaltPanthers Shizheng Li
 *
 */



public class CitySim9002 {

    public static String errorMessage = "Please enter one integer argument, seed";

    public static void main(String[] args) {
        int seed = 0;
        Validator validator = new Validator();
        if (validator.validateArguments(args)) {
            seed = Integer.parseInt(args[0]);
            System.out.println("Welcome to CitySim! Your seed is " + seed + "." );
            begin(seed);
        }
        else {

            System.out.println(errorMessage);

        }

    }

    public static void begin(int seed){
        Random rand = new Random(seed);

        for(int i=1; i<=5; ++i){
            int visiIndex = rand.nextInt(4);
            Visitor visitor = new Visitor();
            System.out.println("Visitor " + i + " is a " + visitor.vistorGenerator(visiIndex, i));
            int index = rand.nextInt(4);
            while(index !=4){
                Location location = new Location();
                System.out.println("Visitor " + i + " is going to " + location.locationGenerator(index, i) + ".");

                if(new Preference().like(location.locationGenerator(index, i), visitor.vistorGenerator(visiIndex, i))){
                    System.out.println("Visitor " + i + " did like " + location.locationGenerator(index, i) + "." );
                } else{
                    System.out.println("Visitor " + i + " did not like " + location.locationGenerator(index, i) + "." );
                }

                index = rand.nextInt(5);
            }
            System.out.println("Visitor " + i + " has left the city.");
            System.out.println("***");
        }
    }
}




















