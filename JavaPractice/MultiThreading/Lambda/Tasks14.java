package MultiThreading.Lambda;

import java.util.stream.Stream;

public class Tasks14 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream
            .iterate(1, n -> n + 1)  // Start from 1, keep adding 1
            .limit(20);             // Generate first 20 numbers

        // Display only the first 10 numbers using forEach
        nums
            .limit(10)              // Limit display to 10
            .forEach(System.out::println);  // Print each number
    }
}

    
