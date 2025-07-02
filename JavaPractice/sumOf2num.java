import java.util.Scanner;

public class sumOf2num {
    public static void main(String[] args) {
    
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1st number is : ");
        int A = sc.nextInt();
        System.out.println("2nd number is :");
        int B = sc.nextInt();
        int addition = A+B;
        System.out.println("SUm of two numbers is "+ addition);
        sc.close();
    }
    
}
