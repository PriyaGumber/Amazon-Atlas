package JavaTraining;

import java.util.Scanner;

public class Task012 {
    public static void main(String[] args) {
        System.out.println("Use do-while to check credentials");

        Scanner sc = new Scanner(System.in);

        String username = "Prasumbna";
        String password = "12345678";
        int count = 0;

        String loginname;
        String loginID;

        do {
            System.out.println("Enter the login name:");
            loginname = sc.nextLine();

            System.out.println("Enter the password:");
            loginID = sc.nextLine();

            if (loginname.equals(username) && loginID.equals(password)) {
                count++;
                System.out.println("You have logged in correctly");
                System.out.println("Login count: " + count);
            } else {
                System.out.println("Invalid login. Exiting...");
                break; // stop the loop if credentials are invalid
            }

        } while (true); // loop continues until break is triggered

        sc.close();
    }
}