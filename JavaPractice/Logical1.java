import java.util.Scanner;

public class Logical1 {
    public static void main(String[] args) {
        System.out.println(" Lets find out the discount applied ");

        Scanner sc = new Scanner(System.in);


         System.out.println("Enter your age : ");
         int age = sc.nextInt();

         System.out.println("Are you a female : ");

         boolean isFemale = sc.nextBoolean();
         System.out.println("Are you a Female : (True/False)" + isFemale );
         
        System.out.println("Age of the persion is : " + age);

        if (age < 5)
        {
            System.out.println("Applied discount is 75 %");
        }

        else if ( isFemale )
        {
            System.out.println(" Applied discount is 60");
        }

        else if (age > 60 && !isFemale)
        {
            System.out.println(" Applied discount is 25 ");

        }
        else 
        {
            System.out.println(" No discount for you cutie");
        }

        sc.close();
       

    }
    
}
