
package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 55, 87, 12, 96, 78);
        
        //using Stream
     
        Stream<Integer> streamNumber =numbers.stream();
        System.out.println("In  a single line ");
        numbers.stream().filter(n -> n%2 == 0.).forEach(n ->System.out.print(n+" "));;
        
        
      
        
        
        System.out.println();
     // Without using Stream
        List<Integer> even = new ArrayList<>();
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        System.out.println("Even numbers without Stream: " + even);
        
        
	}
}
