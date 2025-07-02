package MultiThreading.Lambda;
// wap to create an arraylist and square them and give the output

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList of numbers
       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Step 2: Create another list to store squares
         List<Integer> squareOfNums = numbers.stream()
                                            .map(num -> num * num)
                                            .collect(Collectors.toList());


        // Step 4: Print the squared numbers
        System.out.println("Squared Numbers: " + squareOfNums);
    }
}

