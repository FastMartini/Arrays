import java.util.Scanner;

public class Two_Sum {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{}; // Return an empty array if no valid pair is found
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

        // Input target value
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();

        // Find the indices of the two numbers that sum to the target
        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices of the numbers that sum to the target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No two numbers sum to the target.");
        }

        scanner.close();
    }
}

