//wap to determine if the number is positive, negative or zero

import java.util.Scanner;

public class Logical2 {
    public static void main(String[] args) {
        System.out.println(" lets determine the number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        if (number > 0)
        {
            System.out.println("Number is positive");
        }
        else if (number < 0)
        {
            System.out.println(" Number is negative");
        }
        else 
        {
            System.out.println(" Number is 0");

        }
        sc.close();
    }
    
}
