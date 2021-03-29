import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {

        int[] nums = {75,29,350,7,4192};
//
//        System.out.println(nums[3]);
//
//        nums[3] = 51;

//        System.out.println(nums[3]);

//        for (int i = 0 ; i < nums.length ; i++){
//            System.out.println(nums[i]);
//        }
//
//        for (int i = nums.length - 1 ; i >= 0 ; i--){
//            System.out.println(nums[i]);
//        }

//        int count = 0;
//        int sum = 0;
//
//
//        for (int i = 0 ; i < nums.length ; i++){
//            if (nums[i] > 100){
//                count ++;
//                sum = sum + nums[i];
////                System.out.println(nums[i]);
//            }
//        }
//        System.out.println("# of numbers greater than 100: " + count);
//        System.out.println("Sum of numbers greater than 100: " + sum);
//        System.out.println("Mean: " + (sum / nums.length) );

//        double[] foo = {4.0,9.2,102.6,78.2,85.5,141.1,96.2};
//        double[] bar = new double[3];
//        System.out.println(bar[1]);

//        Scanner scanner = new Scanner(System.in);
//
//        String[] predictions = new String[3];
//        predictions[0] = "a pioneer";
//        predictions[1] = "loved by many";
//        predictions[2] = "very wealthy";
//
//        System.out.print("Predict future. Choose 1, 2, or 3: ");
//        int choice  = scanner.nextInt();
//
//        System.out.println(predictions[choice]);

//        System.out.print("Number of laps: ");
//        int numberOfLaps = scanner.nextInt();
//
//        double[] lapTimes = new double[numberOfLaps];
//
//        for (int i = 0 ; i < numberOfLaps ; i++){
//            System.out.println("Lap time: ");
//            lapTimes[i] = scanner.nextDouble();
//        }
//
//        double fastestTime = lapTimes[0];
//        for (int i = 0 ; i < lapTimes.length ; i++){
//            if(lapTimes[i] < fastestTime){
//                fastestTime = lapTimes[i];
//            }
//        }
//
//        System.out.println("Fastest time: " + fastestTime);

        exercises();
    }

    public static void exercises() {

        // Exercise 1
//        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
//
//        for(int i = 0 ; i < array1.length ; i++){
//            System.out.println(array1[i]);
//        }

        // Exercise 2
//        int[] array2 = new int [20];
//
//        for ( int i = 0 ; i < array2.length ; i++){
//            array2[i] = i + 1;
//        }
//
//        for (int i = array2.length - 1 ; i >= 0 ; i--){
//            System.out.println(array2[i]);
//        }

        // Exercise 3
//        double[] array3 = {3.0, 6.6, 45.3, 76.2, 110.3};
//        double sum = 0;
//        int length = array3.length;
//
//        for ( int i = 0 ; i < array3.length ; i++){
//            sum = sum + array3[i];
//        }
//
//        System.out.println("Sum: " + sum);
//        System.out.println("Mean: " + (sum/ length));

        // Exercise 4
        Scanner scanner = new Scanner(System.in);
        String[] foodArray = new String [3];

        for ( int i = 0 ; i < 4 ; i++){
            System.out.print((i+1) + " - Top Food: ");
            String favoriteFood  = scanner.nextLine();
            if (i < 3) {
                foodArray[i] = favoriteFood;
            }
            else{
                System.out.println("No more memory!");
            }
        }
        for ( int i = 0 ; i < foodArray.length ; i++){
            System.out.println(foodArray[i]);
        }




    }
}
