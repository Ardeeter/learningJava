import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loops {
    public static void main(String[] args) {
//        int i = 0;
//        while (i < 10){
//            System.out.println(i);
//            i++;
//            // i--;
//            // i += 1;
//        }
//        forLoop();
//        remainder();
        challenge();
    }



    public static void forLoop() {
//        for (int i = 0 ; i < 10 ; i++){
//            System.out.println(i);
//        }
//        for (int i = 10 ; i > 0 ; i--){
//            System.out.println(i);
//        }
//        for (int i = 1 ; i <= 5 ; i++){
//
//            if (i == 2){
//                continue;
//            }
//            if (i == 4){
//                break;
//            }
//            System.out.println(i);
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        do {
//            int num = ThreadLocalRandom.current().nextInt(1, 7);
//            System.out.println("You rolled a " + num + ".");
//            System.out.print("Roll again? y/n: ");
//            again = scanner.next();
//        } while (again.equals("y"));
    }

//    public static void remainder() {
//        // check if a number is even -- remainder should be 0
//        System.out.println(15 % 2 == 0);
//    }

    public static void challenge() {

        // exercise 1
//        for ( int i = 89 ; i < 118 ; i++){
//            System.out.println(i);
//        }

        // exercise 2
//        for ( int i = 1 ; i < 41 ; i++){
//            System.out.println(i);
//            if(i % 3 == 0){
//                System.out.println("Quack");
//            }
//        }

        // exercise 3
//        Scanner scanner = new Scanner(System.in);
//        String guess;
//        String password = "shark50";
//
//        do{
//            System.out.print("Enter password: ");
//            guess = scanner.next();
//        } while (!(guess.equals(password)));
//        System.out.println("ACCESS APPROVED");

        // exercise 4
//        int i = 0;
//        while (i < 11){
//            System.out.println(i);
//            i++;
//        }

        // exercise 5
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        Scanner scanner = new Scanner(System.in);
        String guess;

        do{
            System.out.println("Enter guess: ");
            guess = scanner.next();
            if(guess < randomNumber){

            }
        }

    }


}
