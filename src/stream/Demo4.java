package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function; 

public class Demo4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6,7,8);

        // Lambda that multiplies each number by 3
        Function<Integer, Integer> fun = a -> a * 2;

        // Apply the function to each element using stream.map()
        numbers.stream().map(fun).forEach(n->System.out.print(n +" " ));
    }
}
