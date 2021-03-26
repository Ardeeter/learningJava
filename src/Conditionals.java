import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Conditionals {
    public static void main(String[] args) {

        // > >= < <=
        // || or && and

       /* System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        if (false){
            System.out.println(4);
            System.out.println(5);
            System.out.println(6);
        } else {
            System.out.println(7);
            System.out.println(8);
            System.out.println(9);
        }

        */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to SuperFast Rollercoaster!");
//        System.out.print("Please enter your height in centimeters: ");
//        int height = scanner.nextInt();
//
//        if (height < 130){
//            System.out.println("Sorry, you are too short.");
//        } else if (height > 210){
//            System.out.println("Sorry, you are too tall");
//        } else {
//            System.out.println("Height accepted. Go ahead!");
//        }
//
//        if (height < 130 || height > 210){
//            System.out.println("Sorry you do not meet height requirements!");
//        } else {
//            System.out.println("Height accepted. Go ahead!");
//        }

//        Scanner scanner = new Scanner(System.in);

//        System.out.println("The VIP Lounge");
//
//        System.out.print("Age: ");
//        int age = scanner.nextInt();

//        System.out.println("Do you have a VIP pass? y/n");
//        String vipPass = scanner.next();

//        if (age >= 18 && vipPass.equals("y")){
//            System.out.println("GO in!");
//        }
//        else {
//            System.out.println("Sorry, no can do.");
//        }

//        if (age >= 18){
//            System.out.println("Do you have a VIP pass? y/n");
//            String vipPass = scanner.next();
//            if (vipPass.equals("y")){
//                System.out.println("GO in!");
//            }
//            else {
//                System.out.println("Sorry you must have VIP pass.");
//            }
//        }
//        else {
//            System.out.println("Sorry, you must be older than 17");
//        }

//        int numPets = 0;
//
//        if (true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Enter the number of pets you own: ");
//            numPets = scanner.nextInt();
//
//        }
//
//        System.out.println("You have " + numPets + " pets");

//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//
//        switch (num){
//            case 1:
//                System.out.println("You've entered one.");
//                break;
//            case 2:
//                System.out.println("You've entered two.");
//                break;
//            default:
//                System.out.println("Invalid number");
//                break;
//
//        }

        challenge3();

    }

    public static void challenge3() {

//        System.out.print("Please enter first number: ");
//        Scanner xScanner = new Scanner(System.in);
//        int x = xScanner.nextInt();
//
//        System.out.print("Please enter second number: ");
//        Scanner yScanner = new Scanner(System.in);
//        int y = yScanner.nextInt();
//
//        if (x > y){
//            System.out.format("%d is bigger than %d", x, y);
//        } else if (y > x) {
//            System.out.format("%d is smaller than %d", x, y);
//        } else {
//            System.out.format("%d is equal to %d", x, y);
//        }
//
//        System.out.format("\nThe difference between %d and %d is %d", x, y, (x-y));

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.print("Please enter your guess (btwn 1-5): ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if (guess == randomNumber){
            System.out.println("Correct! Aren't you lucky!");
        } else {

            System.out.print("Guess again: ");
            Scanner secondScanner = new Scanner(System.in);
            int guess2 = secondScanner.nextInt();

            if(guess2 == randomNumber){
                System.out.println("Correct! Aren't you lucky!");
            } else {
                System.out.println("Hard luck! Maybe next time!");
                System.out.println(randomNumber);
            }

        }



    }

}
