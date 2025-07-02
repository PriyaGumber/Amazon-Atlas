public class ReverseArrayExample {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 56, 61};
        int n = arr.length;

        // Create an array for the reversed version
        int[] rev = new int[n];

        // Fill the rev array
        for (int i = n - 1, j = 0; i >= 0; i--, j++) {
            rev[j] = arr[i];
        }

        // Print the reversed array
        System.out.println("Reversed Array:");
        for (int elem : rev) {
            System.out.print(elem + " ");
        }
    }
}
