package JavaTraining;

import java.util.Scanner;

public class Task009 {
    public static void main(String[] args) {
         System.out.println(" Check the greater number out of 3 numbers");

         Scanner sc = new Scanner(System.in);

         System.out.println(" Enter 1st number");
         int a = sc.nextInt();

         System.out.println(" Enter 2nd number");
         int b = sc.nextInt();

         System.out.println(" Enter 3rd  number");
         int c = sc.nextInt();

         if (a>b && a > c)
         {
            System.out.println(" greatest of them is : " + a);
         }

         else if (b > a && b >c)
         { 
            System.out.println(" greatest of them is : "+ b);

         }

         else
         {
            System.out.println(" greatest of them is : " + c);
         }
    }
    
}
