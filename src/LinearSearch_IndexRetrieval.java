import java.util.Scanner;

public class LinearSearch_IndexRetrieval {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] numbers = {12, 34, 56, 78, 90, 100};

        System.out.print("Enter a target number to find: ");

        int targetNum = scnr.nextInt();

        for (int n : numbers) {
            if (targetNum != n) {
                System.out.println("Not found.");
            } else {
                System.out.println("found.");
                break;
            }
        }
        scnr.close();
    }
}
