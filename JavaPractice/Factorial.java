import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(" Lets create a method to find out the factorial of a number");

        fact();
    }

    protected static long fact()
    {

        System.out.println("\n Provide the number to create the factorial");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        long factorial = 1;
        
        for(int i = 1; i<=num ; i ++)
        {
            factorial *= i ;
        }

        System.out.println(factorial);

        return (factorial);

    }

}