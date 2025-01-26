public class Remove_Duplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int uniqueCount = 1; // Start with the first element as unique

        // Use a two-pointer approach
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i]; // Move the unique element forward
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        // Example input array
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};

        int uniqueCount = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + uniqueCount);

        System.out.print("Modified array with unique elements: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
