package HashTables;

import java.util.Hashtable;
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> phoneBook = new Hashtable<>();

        // Get input
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.nextLine();

        // Put in Hashtable
        phoneBook.put(name, phoneNumber);

        // Get input for searching
        System.out.print("Search name: ");
        String searchName = sc.nextLine();

        // Get and display result
        String result = phoneBook.get(searchName);
        System.out.println(result != null ? "Number: " + result : "Not found");

        sc.close();
    }
}
