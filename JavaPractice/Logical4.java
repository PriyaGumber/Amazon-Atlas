import java.util.Scanner;

public class Logical4 {
    public static void main(String[] args) {
        System.out.println(" Determine the number is even or odd");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number");
        int num = sc.nextInt();
        if(num% 2 == 0)
        {
            System.out.println("number is an even number");
        }
        else{
            System.out.println(" Number is an odd number");
        }
        sc.close();
    }
    
}
