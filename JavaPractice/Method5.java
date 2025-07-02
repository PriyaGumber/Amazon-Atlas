import java.util.Scanner;

public class Method5 {
    public static void main(String[] args) {
        System.out.println("Lets print only odd numbers from 1 to N");
        odd();
    }

    public static void odd()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Provide the value of num : " );
        int num = sc.nextInt();

        System.out.println(" Odd numbers in 1 to "+ num + " are");

        for(int i =1; i<num ; i++)
        {
            if (i %2  != 0)
            {
                System.out.println(i);

            }
            
        }
    }
    
}
