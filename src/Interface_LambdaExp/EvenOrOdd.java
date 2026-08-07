package Interface_LambdaExp;

interface NumberCheck {
    void check(int number);
}

public class EvenOrOdd {
    public static void main(String[] args) {
        

        NumberCheck numCheck = (number) -> {
            if (number % 2 == 0) {
                System.out.println(number + " is Even");
            } else {
                System.out.println(number + " is Odd");
            }
        };
        
        
        numCheck.check(24);
    }
}
