public class Basic_Array_Initialization{
    public static void main(String[] args) {
        int[] numbers = new int[5];

        for (int i = 1; i <= numbers.length; i++) {
            System.out.println("Number = " + i);
        }

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}