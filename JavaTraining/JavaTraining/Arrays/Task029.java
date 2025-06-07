package JavaTraining.Arrays;

public class Task029 {

    public static void main(String args[]) {
        int intArray[] = { 1, 2, 3 };  // Original array

        int cloneArray[] = intArray.clone(); // Create a copy

        intArray[1] = 4;  // Change 2nd element in the original array

        // Check if both arrays are the same (point to same memory)
        System.out.println(intArray == cloneArray);  // false

        // Print the cloned array
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.print(cloneArray[i] + " ");
        }

        System.out.println("\nOriginal Array");

        // Print the original array
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }
}
    

