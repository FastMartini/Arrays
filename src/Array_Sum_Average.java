import java.util.Scanner;

public class Array_Sum_Average {
    public  static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Select how many integers for array: ");

        int n = scnr.nextInt();

        if (n <= 0) {
            System.out.println("The number of integers must be greater than 0.");
        } else {
            int[] numbers = new int[n];
            int sum = 0;

            System.out.println("Enter " + n + " integers: ");
            for (int i = 0; i < n; i++) {
                System.out.print("Enter integer " + (i + 1) + ": ");
                numbers[i] = scnr.nextInt();
                sum += numbers[i];
            }

            double average = (double) sum / n;
            double roundVal = Math.round(average * 100.0) / 100.0;

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + roundVal);
        }

        scnr.close();
    }
}
