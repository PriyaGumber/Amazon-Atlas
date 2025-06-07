package JavaTraining;

public class Task034 {

    // Method with 2 parameters
    void add(int x, int y) {
        //int sum = x+y
        System.out.println("Add method with 2 values:");
        System.out.println("x = " + x + ", y = " + y);
       // System.out.println("Sum is : " + sum);
    }

    // Overloaded method with 3 parameters
    void add(int x, int y, int z) {
        System.out.println("Add method with 3 values:");
        System.out.println("x = " + x + ", y = " + y + ", z = " + z);
    }

    // Main method to test overloading
    public static void main(String[] args) {
        Task034 obj = new Task034();

        // Call the first version
        obj.add(10, 20);

        // Call the overloaded version
        obj.add(5, 15, 25);
    }
}
    
