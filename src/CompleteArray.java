import java.util.Arrays;
import java.util.Scanner;

public class CompleteArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] numbers = {2, 29, 33, 4, 15, 62, 7, 81, 9, 10};

// Declare sum variable, assign it initial value of zero
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("Static array: " + Arrays.toString(numbers));
        System.out.println("The sum of all the numbers in the static array is: " + sum);

        System.out.println();

        System.out.println("Now its your turn to enter numbers in to the array");
        System.out.println("Enter " + numbers.length + " numbers."    );

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number #: " + (i+1));
            numbers[i] = input.nextInt();
        }

        //Reset sum
        sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        System.out.println("The numbers you entered were: " + Arrays.toString(numbers));
        System.out.println("The sum of the numbers you entered is : " + sum);

    }
}


