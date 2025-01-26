import java.util.Scanner;

public class No_Twos_Or_Fives {

        public static boolean no14(int[] nums) {
            boolean hasTwo = false;
            boolean hasFive = false;

            // Traverse the array to check for 2's and 5's
            for (int num : nums) {
                if (num == 2) hasTwo = true;
                if (num == 5) hasFive = true;

                // If both 2 and 5 are found, return false immediately
                if (hasTwo && hasFive) return false;
            }

            // Return true if the array contains either no 2's or no 5's
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input array size
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Input array elements
            int[] nums = new int[size];
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                nums[i] = scanner.nextInt();
            }

            // Call no14 and print the result
            boolean result = no14(nums);
            System.out.println("Result: " + result);

            scanner.close();
        }
    }
