class Student {
    public int roll_no;
    public String name;

    // Parameterized constructor
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Task023 {
    public static void main(String[] args) {
        // Declares and initializes an array of Student objects
        Student[] arr = new Student[5];

        // Initializing the elements of the array
        arr[0] = new Student(1, "Aman");
        arr[1] = new Student(2, "Vaibhav");
        arr[2] = new Student(3, "Shikhar");
        arr[3] = new Student(4, "Dharmesh");
        arr[4] = new Student(5, "Mohit");

        // Accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : { " +
                               arr[i].roll_no + " " + arr[i].name + " }");
        }
    }
}
