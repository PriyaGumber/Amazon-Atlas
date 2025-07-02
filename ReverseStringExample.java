public class ReverseStringExample {
    public static void main(String[] args) {
        String str = "Hello";           // Original String
        String reversed = "";           // To hold the reversed version

        // Loop from the end of the original String
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        // Print the result
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }
}
