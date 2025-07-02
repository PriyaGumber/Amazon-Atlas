package MultiThreading.Lambda;
// wap to filter odd numbers

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of numbers
       List<Integer> numbers = Arrays.asList(11, 22, 35, 45, 55);

//and now filter the odd elements 
List<Integer> addNumbers = numbers.stream()
                                        .filter(num -> num % 2 !=0)
                                        .collect(Collectors.toList());

 //// Step 4: Print the odd numbers   
 System.out.println(" Odd numbers are : "+ addNumbers);                                    


    
}

}
