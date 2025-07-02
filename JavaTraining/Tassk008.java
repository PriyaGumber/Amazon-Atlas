package JavaTraining;

import java.util.Scanner;

public class Tassk008 {
    public static void main(String[] args) {

        System.out.println(" Lets check the greater number");

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter 1st number ");
        int a = sc.nextInt();

        System.out.println(" Enter 2nd number");
        int b = sc.nextInt();

        if(a>b)
        {
            System.out.println(" a is the greater number ");
        }
        else
        {
            System.out.println(" b is greater number");
        }

        sc.close();
        
    }
    
}
