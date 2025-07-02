import java.util.Scanner;

public class Method4 {
    public static void main(String[] args) {
        System.out.println(" Lets create a method for multiplication table");
        multiplication();
    }

    public static void multiplication()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println(" Enter the number to create the table");
        int num = sc.nextInt();

        int i ;
        for(i=1; i<=10 ; i++)
        {

        System.out.println(num + "* " + i + " = "+ (num*i));
        }
    }
    
}
