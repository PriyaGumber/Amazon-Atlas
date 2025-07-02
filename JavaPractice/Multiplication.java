import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) { 
        
    Scanner sc = new Scanner(System.in);
    System.out.println("First number is : ");
    Float A = sc.nextFloat();
    System.out.println("The second number is : ");
    Float B = sc.nextFloat();
    Float multipli = A*B;
    System.out.println("Multiplication of these twp numbers is : " + multipli );
    sc.close();

    }
    
}
