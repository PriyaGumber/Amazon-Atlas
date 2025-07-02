package MultiThreading.Lambda;
//Task 13:

//Wap to create an arrayList of your friends using string and try to sort them and display

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task13 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of numbers

        List<String> friends = Arrays.asList("ananya", "Shanaya", "manya", "Tanya", "Waanya");
    
        List<String> SortedNames= friends.stream()
                                          .sorted()
                                          .collect(Collectors.toList());
        System.out.println("Name of friends : "+ SortedNames);                              
    
}

}
