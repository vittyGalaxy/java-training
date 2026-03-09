package section14;

public class CurrentAccountClass {
    private double balance;
    private int id;

    public CurrentAccountClass(int id, double balance) {
        setId(id);
        setBalance(balance);
    }

    public void withdraw(double amount) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I withdraw " + amount + " from the account " + getId());
        setBalance(getBalance() - amount);
    }

    public void deposit(double amount) {
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("I deposit " + amount + " from the account " + getId());
        setBalance(getBalance() + amount);
    }

    public static void transfer(CurrentAccountClass p1, CurrentAccountClass p2, double amount) {
        System.out.println("I move the money from the account " + p1.id + " to account " + p2.id);

        synchronized(p1) {
            System.out.println("Start withdrawal from " + p1.id);
            p1.deposit(amount);
        }

        synchronized(p2) {
            System.out.println("Start payment on " + p2.id);
            p2.deposit(amount);
        }
    }

    // getter
    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
