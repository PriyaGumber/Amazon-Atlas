package MultiThreading.Lambda;
//Wap to create an array list to remove duplicate values from the List.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task11 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of numbers

        List<Integer> numbers = Arrays.asList(11, 22, 11, 22, 5);
        

//and now filter the duplicate elements
List<Integer> RemovDups= numbers.stream()
                                .distinct()
                                .collect(Collectors.toList());

 System.out.println(" Duplicate values removed : "+ RemovDups);                               

    
}

}
