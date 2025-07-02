import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        System.out.println("Lets calculate the perimeter of the rectangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("length is : ");
        int A = sc.nextInt();
        System.out.println("Breadth is : ");
        int B = sc.nextInt();

        int Perimeter = 2  * (A+B);
        System.out.println(" Perimeter is : " + Perimeter);
        sc.close();


    }
    
}
