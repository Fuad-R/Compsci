public class BankAccount {
    
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double val) {
        balance = balance+val;
        System.out.println("Current balance is "+balance);
    }

    public void withdraw(double withdrawal) {
        if (withdrawal > balance) {
            System.out.println("You are trying to withdraw more than you have");
            System.out.println("Your current balance is "+balance);
        }
        else {
        balance = balance - withdrawal;
        System.out.println("Current balance is "+balance);
        }
    }

    public void getBalance() {
        System.out.println("Current balance is "+balance);
    }


}
