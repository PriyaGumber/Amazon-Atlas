public class Task027 {
    // Driver method
    public static void main(String args[]) {
        int arr[] = { 3, 1, 2, 5, 4 };

        // passing array to method sum
        sum(arr);
    }

    public static void sum(int[] arr) {
        // getting sum of array values
        int sum = 0;

        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        System.out.println("sum of array values : " + sum);
    }
}
