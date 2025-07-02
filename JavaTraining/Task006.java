package JavaTraining;

import java.util.Scanner;

public class Task006 {
    public static void main(String[] args) {
        System.out.println(" Wap to take user input");
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please provide the name ");
        String name = sc.nextLine();
        System.out.println(" Please provide ID : ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println(" Values I entered : " + name + " " + id);

        System.out.println(" Values I received : "+ name + " " + id);


        sc.close();



    
    }
    
}
