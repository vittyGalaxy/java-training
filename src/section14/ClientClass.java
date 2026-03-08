package section14;

public class ClientClass extends Thread {
    private double withdraw;

    public ClientClass (String name, double withdraw) {
        super();
        this.setName(name);
        this.withdraw = withdraw;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " arrives at the ATM");
        System.out.println("when it arrives " + Thread.currentThread().getName() + " the balance is: " + CurrentClass.getInstance());
        System.out.println("The amount you want to withdraw " + Thread.currentThread().getName() + " is: " + this.withdraw);

        try {
            CurrentClass.getInstance().withdrawal(withdraw);
            System.out.println(Thread.currentThread().getName() + " withdrawal made");
        }catch (Exception e){
            System.out.println(Thread.currentThread().getName() + " you have no money");
            e.printStackTrace();
        }
    }
}
