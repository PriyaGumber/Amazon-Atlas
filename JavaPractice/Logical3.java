import java.util.Scanner;

public class Logical3 {
    public static void main(String[] args) {
        System.out.println("Lets categorize the persom=n into the age actegory");

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please provide the age of the person");
        int age = sc.nextInt();
        if (age <13 )
        {
            System.out.println(" Person is a child");
        }
        else if(age >13 && age <20)
        {
            System.out.println(" Perosn is a teen");
        }
        else if (age> 20 && age < 60)
        {
            System.out.println(" Person is an adult");
        }
        else
        {
            System.out.println(" Person is a senior citizen");

        }

        sc.close();
        
    }
    
}
