package MultiThreading.Lambda;

import java.util.stream.Stream;

public class Task15 {
    public static void main(String[] args) {
        Stream<Integer> nums = Stream
                                .iterate(1, n -> n+1)
                                .limit(20);

Stream<Integer> SkipNums = nums.skip(15);

//SkipNums.forEach(System.out::println);
System.out.println(" using Lambda expression");
SkipNums.forEach(num -> System.out.println(num));



    }
    
}
