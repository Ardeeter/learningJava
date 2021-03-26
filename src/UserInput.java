import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        String b = scanner.next();
        System.out.println(b);*/
        //name();
        //challenge1();
        challenge2();
    }

    public static void name() {
        /*System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println(userName);
        System.out.println(userName + " is a nice name!");

        System.out.println("How old are you?");
        int userAge = scanner.nextInt();
        System.out.println("Your name is " + userName + " and you are " + userAge + "years old.");

        System.out.println("/n How tall are you in meters?");*/

        /*System.out.println(4.5 - 2.7);
        System.out.format("I have %d cats, %d dogs, and 1 %s.", 7, 2, "panther");
        System.out.format("I have %d cats, %d dogs, and 1 %s.", 7.9, 2, "panther");
        System.out.format("I have %.2d cats, %d dogs, and 1 %s.", 7.9, 2, "panther");

        double averageMaleHeightDifference = userHeight - 1.75;
        double averageFemaleHeightDifference = userHeight - 1.62;
        System.out.println("\nThe differnce btwn your height and the average is ");
        System.out.format("%.2fm if you are male")*/
    }

    public static void challenge1(){
        System.out.print("How old are you?");
        Scanner ageScanner = new Scanner(System.in);
        int age = ageScanner.nextInt();
        int dblAge = age * 2;
        System.out.format("You've lived %d years. In another %d years, you'll be %d years old.", age, dblAge, dblAge+age);

    }

    public static void challenge2() {
        System.out.print("How much is the bill?");
        Scanner billScanner = new Scanner(System.in);
        double bill = billScanner.nextDouble();
        System.out.print("How many people?");
        Scanner peopleScanner = new Scanner(System.in);
        int people = peopleScanner.nextInt();
        double splitBill = bill / people;
        System.out.format("Each person should pay $%.2f", splitBill);

    }

}
