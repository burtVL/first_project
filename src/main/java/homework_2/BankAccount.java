package homework_2;

public class BankAccount {
    String owner;
    double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("На счет внесено " + amount);
        }
        else {
            System.out.println("Сумма депозита должна быть больше 0");
        }
    }

    public void widthdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Со счета списано " + amount);
        }
        else {
            System.out.println("Не достаточно средств");
        }
    }

    public void printBalance() {
        System.out.println("Текущий баланс: " + balance);
    }
}
