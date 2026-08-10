package Exception;
import java.util.*;

class BankExp extends Exception {
    String msg;

    public BankExp(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return msg;
    }
}

class BankWithDraw {
    long bal = 1000; // initial balance

    void withDraw(long amt) throws BankExp {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawal successful! Remaining balance: " + bal);
        } else {
            throw new BankExp("Can't Withdraw Due to Insufficient Balance");
        }
    }
}

public class BankException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdraw Amount: ");
        long amt = sc.nextLong();

        BankWithDraw b = new BankWithDraw();

        try {
            b.withDraw(amt);
        } catch (BankExp e) {
            System.out.println(e.getMessage());
        }
    }
}
