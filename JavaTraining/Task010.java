package JavaTraining;

import java.util.Scanner;

public class Task010 {
    public static void main(String[] args) {
        System.out.println(" Lets check which day comes when");

        Scanner sc = new Scanner(System.in);

        System.out.println(" Please enter any number");
        int day = sc.nextInt();

        switch(day) {
            case 1 :
        {
            System.out.println(" The day is monday");
            break;
        }
           case 2 :
            {
                System.out.println(" the day is tuesday");
                break;
            }
          case 3 :
          {
            System.out.println(" the day is wednesday");
            break;
          }
          case 4 :
          {
            System.out.println(" the day is thursday");
            break;
          }
          case 5 :
          {
            System.out.println(" the day is friday ");
            break;
          }
          case 6 :
          {
            System.out.println(" the day is saturday");
            break;
          }
          case 7 :
          {
            System.out.println(" the day is sunday");
            break;
          }
          

          default :
          { 
             System.out.println(" invalid input");
          }

          sc.close();
        
        }
            
        
        


    }
    
}
