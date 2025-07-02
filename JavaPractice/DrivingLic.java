import java.util.Scanner;

public class DrivingLic {

 public static void main(String[] args) {
    System.out.println(" Lets check the age ");
    Scanner sc = new Scanner(System.in);
    int age = sc.nextInt();
    if(age >= 18)
    {
        System.out.println(" Person is eligible");
    }
    else
    {
        System.out.println(" Not eligible");
    }
     sc.close();
    
 }
     
}
