// wap to input name in he between of the output

import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Welcome" + name + "to the KG Group");
        sc.close();


    }

    
}
