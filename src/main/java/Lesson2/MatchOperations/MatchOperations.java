package Lesson2.MatchOperations;

public class MatchOperations {


    public static void main(String[] args) {

        int numberOne = 1;
        int numberTwo = 2;
        double numberThree = 3.0;
        double numberFour = 5.5;


        double summary = numberOne + numberTwo - numberThree / numberFour * numberTwo;

        System.out.println(summary);

        int someNumber = 0;
        int variable = 0;
        variable = variable -1;
        System.out.println("0: " + someNumber);
        System.out.println("1: " + someNumber++);
        System.out.println("2: " + someNumber);

        System.out.println("3: " + (++someNumber));
        System.out.println("4: " + (someNumber));

        System.out.println("2 modulo 3= " + numberTwo % 3);


        //TODO declare 2 variables and write simple calculator : at result print + - / * operations on those variables
    }
}
