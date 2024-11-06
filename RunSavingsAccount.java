import java.util.Scanner;
public class RunSavingsAccount {
    static class SavingsAccount {
        double balance = 0;
        double interestRate = 1.10;

        void setInterestRate(double newRate) {
            this.interestRate = newRate;
        }
        double getInterestRate() {
            return this.interestRate;
        }
        double getBalance() {
            return this.balance;
        }
        void deposit(double amount) {
            if (amount > 0) {
                this.balance += amount;
            }
        }
        void withdraw(double amount) {
            if (amount > 0 && this.balance >= amount) {
                this.balance -= amount;
            }
        }
        void addInterest() {
            this.balance += this.balance * 0.10 ;
        }
    }
    public static void showBalance(SavingsAccount account) {
        System.out.println("Your Balance is: " + account.getBalance());
    }
    public static void showNewBalance(SavingsAccount account){
        System.out.println("Your New Balance is: " + account.getBalance());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();

        System.out.println("Enter interest rate: ");
        double rate = sc.nextDouble();
        account.setInterestRate(rate);

        System.out.println("Enter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        showBalance(account);
        
        while (true) {
            System.out.println("Press 'D' for another deposit, 'W' for withdraw, 'S' to stop: ");
            String action = sc.next();
        
            if (action.equals("s")) {
                break;
            }
        
            if (action.equals("d")) {
                System.out.println("Enter deposit amount: ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);
                if (account.getBalance() > 1000) {
                    account.addInterest();
                    showNewBalance(account);
                }
            } else if (action.equals("w")) {
                System.out.println("Enter withdraw amount: ");
                double withdraw = sc.nextDouble();
                account.withdraw(withdraw);
            }
        }
        sc.close();
    }
}
