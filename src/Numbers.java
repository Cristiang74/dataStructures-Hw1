import java.util.ArrayList;
import java.util.Scanner;

public class Numbers {

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int sum = 0;
    int product = 1;
 

    public void run() {
        Scanner userInput = new Scanner(System.in);
        numbers = new ArrayList<Integer>();

        // User number input; repeats the same question 5 times, asking them to input a
        // number
        for (int i = 0; i < 5; i++) {
            System.out.println("\nPlease enter a number (1-99): ");
            numbers.add(Integer.parseInt(userInput.nextLine()));
        }
        System.out.printf("Your Lucky Numbers Are... %s \n", numbers.toString());

        // for loop to find the sum of the arraylist
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.printf("\nThe sum of your numbers is %s", sum);

        // For loop to find the product of the arraylist
        for (int i = 0; i < numbers.size(); i++) {
            product = numbers.get(i) * product;
        }
        System.out.printf("\nThe Product of your numbers is %s", product);


        int min = numbers.get(0);
        int max = numbers.get(0);
        // For loop to find the min and max value in the array list
        for (int i = 1; i < numbers.size(); i++) {


            // if current value is less than min value, set as new min
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }
            

            // if current value is greater than max value, set as new max
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
            

        }
        System.out.printf("\nYour smallest value is %s", min);
        System.out.printf("\nYour max value is %s\n", max);
        // System.out.println("\nPlease enter the first number: ");
        // int firstNum = Integer.parseInt(userInput.nextLine());

        // System.out.println("\nPlease enter the first number: ");
        // int firstNum = Integer.parseInt(userInput.nextLine());

        // System.out.println("\nPlease enter the first number: ");
        // int firstNum = Integer.parseInt(userInput.nextLine());

        // System.out.println("\nPlease enter the first number: ");
        // int firstNum = Integer.parseInt(userInput.nextLine());

        // numbers.add(firstNum);

    }

}