import java.util.Scanner;

public class Logical6 {
    public static void main(String[] args) {
        System.out.println(" Lets determine if the year is a leap year");
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter the year of your choice");
        int year = sc.nextInt();

        if((year % 400 ==0 )|| (year% 4 == 0 && year%100 != 0))
        {
            System.out.println(" Year is a leap yaer");
        }
        else
        {
            System.out.println(" Year is not a leap year");

        }

        sc.close();
    }
    
}
    
