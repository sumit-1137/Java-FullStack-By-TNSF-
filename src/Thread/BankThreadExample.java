package Thread;

class ATM {
    int balance = 2000;

    synchronized void deposite(int amount) {
        System.out.println(amount + " INR Amount Credited successfully ");
        balance += amount;
        System.out.println("Balance is = " + balance);

    }

    synchronized void withDraw(int amount) {
        if (amount <= balance) {
            System.out.println(amount + " INR Amount Debited successfully ");
            balance -= amount;
            System.out.println("Balance is = " + balance);
        } else {
            System.out.println("Insuffient amount");
        }

    }
}

class User extends Thread {
    String msg;
    int amount;
    ATM atm;

    User(ATM atm, String msg, int amount) {
        this.atm = atm;
        this.msg = msg;
        this.amount = amount;

    }

    public void run() {
        if (msg == "deposite") {
            atm.deposite(amount);
        } else if (msg == "withdraw") {
            atm.withDraw(amount);
        } else {
            System.out.println("Wrong Operation ");
        }
    }

}

public class BankThreadExample {
    public static void main(String[] args) {
        ATM atm = new ATM();
        User user1 = new User(atm, "withdraw", 2000);
        User user2 = new User(atm, "withdraw", 8000);
       // User user3 = new User(atm, "withdraw", 2000);

        user1.start();
        user2.start();
       // user3.start();
        
        try {
			user1.join();
			//System.out.println(user1.getState());
			user2.join();
			//System.out.println(user2.getState());
			//user3.join();
			//System.out.println(user3.getState());
		} catch (Exception e) {
			System.out.println("handle");
			// TODO: handle exception
		}

    }

}