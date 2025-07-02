package JavaTraining;

import java.util.Scanner;

public class Task011 {
    public static void main(String[] args) {
        System.out.println(" check login creditionals are valid or not");

        Scanner sc = new Scanner(System.in);

        String username = "Prasumbna";
        String id = "12345678";
       int count =0;

        while(true)
        {
        
        System.out.println(" Enter the loginname");
        String loginname = sc.nextLine();

        System.out.println("Enter the password");
        String loginID = sc.nextLine();

        if(loginname.equals(username)&&(id.equals(loginID)))
        {
            count++;
            System.out.println(" You have looged in correctly");
        }
         
        else 
        {
            System.out.println(" Invalid loggin");
        

        }
         break;

    
    }

    sc.close();
    
}

}
