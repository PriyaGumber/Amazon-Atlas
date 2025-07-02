import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Lets calculate area of a Triangle");
        Scanner sc = new Scanner(System.in);
        System.out.println("Breadth of the triangle is : ");
       int B =  sc.nextInt();
       System.out.println("Height of the triangle is : " );
       int H = sc.nextInt();
       double Area = 0.5 * (B *H);
       System.out.println("Area of traingle is : " + Area);
       sc.close();
        
    }
    
}
