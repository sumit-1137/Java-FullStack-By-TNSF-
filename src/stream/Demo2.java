package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(1, 55, 87, 12, 96, 78);

        // Without using Stream
        List<Integer> even = new ArrayList<>();
        for (Integer num : list) {
            if (num % 2 == 0) {
                even.add(num);
            }
        }
        System.out.println("Even numbers without Stream: " + even);

        // Using Stream
        List<Integer> streamEven = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println("Even numbers with Stream: " + streamEven);
    }
}
