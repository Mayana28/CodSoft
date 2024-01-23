import java.util.Scanner;
 class Atm{
    private int balance;

    public Atm(int in_bal) {
        if (in_bal > 0)
            balance = in_bal;
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if (balance >= amt) {
            balance -= amt;
        }
    }

    public int getbalance() {
        return balance;
    }
}

public class ATMinterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm a = new Atm(10000);

        int opt, amt, acc_no;
        String name;
        System.out.println("Enter the account holder name:\n");
        name = sc.nextLine();
        System.out.println("Enter your account number:\n");
        acc_no = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.println("");
        System.out.println("Details of the Customer:\n");
        System.out.println("The name of the Account Holder is:" + name);
        System.out.println("The  Account Number is:" + acc_no);

        do {
            System.out.println("!!!!****WELCOME TO YOUR AUTOMATED TELLER MACHINE INTERFACE****!!!!\n");
            System.out.println("Select your choice form the following: \n");
            System.out.println("1: Check the balance in your account\n");
            System.out.println("2: To deposit the amount in the account \n");
            System.out.println("3: To withdraw the amount in the account \n");
            System.out.println("4: To exit \n");
            System.out.println("Enter your choice:\n");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("The total balance in your account is: " + a.getbalance() + "\n");
                    break;
                case 2:
                    System.out.println("Enter the amount you want to deposit:\n");
                    amt = sc.nextInt();
                    a.deposit(amt);
                    System.out.println("Your amount has been deposited successfully!!");
                    break;
                case 3:
                    System.out.println("Enter the amount you want to withdraw:\n");
                    amt = sc.nextInt();
                    a.withdraw(amt);
                    System.out.println("Your amount has been withdrawn successfully!!");
                    break;
                case 4:
                    System.out.println("Thank you for choosing us!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        } while (opt != 4);
    }
}
