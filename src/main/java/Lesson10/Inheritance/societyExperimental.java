package Lesson10.Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class societyExperimental {

    static List<Human> society = new ArrayList<>();
    static int peopleOnPlanet = new Random().nextInt(1000);

    public static void main(String[] args) {
        /**
         * Hello in wolrd simulator. Compete the aplication to have answers
         * 1. How many Man and Woman are living in simulaton
         * 2. how many man ar not real man
         * 3. how many mans are disabled
         * 4. how many shoes are on planet
         * 5. what is average height
         * 6. and many many more, just use yours imagination
         */


        crateTheWorld();
        System.out.println("we have " + society.size() + "peoples On Planet");

        Scanner scaner = new Scanner(System.in);
        int exitSignal = 1;
        do {

            System.out.println("Press 0 to end simulation");
            System.out.println("what Would you do: \n 1: get count of all people \n 2: get all mens ");
            int option = scaner.nextInt();
            switch (option) {
                case 0:
                    exitSignal = 0;
                    System.out.println("closing simulation");

                    break;
                case 1:
                    printAllPeople();
                    break;
                case 2:
                    //TODO complete the steps
                    break;
                default:
                    System.out.println("Wrong option, try again");
            }
        }
        while (exitSignal != 0);
        System.out.println("The world has gone");
    }

    public static void printAllPeople() {
        System.out.println("we have " + society.size() + "peoples On Planet");
    }

    public static void crateTheWorld() {
        int counter = 0;
        while (counter != peopleOnPlanet) {
            counter++;
            if (counter % 3 == 0) {
                society.add(new Man());
            } else {
                society.add(new Woman());
            }
        }
    }
}
