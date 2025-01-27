public class Sorting_Array {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 5, 6};

        printArray(numbers);

        bubbleSort(numbers);

        printArray(numbers);
    }

    public static void bubbleSort(int[] numbers) {
        int n = numbers.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;


            for (int j = 0; j < n - 1 - i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void printArray(int[] numbers) {
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
