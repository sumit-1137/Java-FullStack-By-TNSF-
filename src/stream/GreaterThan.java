/*
 * 1. Numbers Greater Than 50 Problem Statement: Create a list of integers and
 * use the Stream API filter() method to display numbers greater than 50.
 * Implement the filter() operation using: • Anonymous Class • Lambda Expression
 * Input: 20, 60, 40, 80, 30, 90 Output: 60, 80, 90 package stream;
 * 
 * 
 */
package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class GreaterThan {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20, 60, 40, 80, 30, 90);

        System.out.println("Using Anonymous Class:");
        numbers.stream().filter(new Predicate<Integer>() {
        	
                   @Override
                   public boolean test(Integer n) {
                       return n > 50; 
                   }
               }).forEach(n -> System.out.print(n +" "));

        
        System.out.println();
        
        System.out.println("Using Lambda Expression:");
        numbers.stream().filter(n -> n > 50).forEach(n -> System.out.print(n +" "));
    }
}
