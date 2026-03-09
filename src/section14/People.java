package section14;

public class People {
    private String name;
    private boolean greeted;

    public People(String name) {
        setName(name);
    }

    public void greeted(People p) {
        while (!this.greeted) {
            try {
                System.out.println(getName() + " he waits for" + p.getName() + " to greet him!");
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        this.greeted = true;
        System.out.println("Hi " + p.getName());
    }

    // getter
    public String getName() {
        return this.name;
    }

    public boolean getGreeted() {
        return this.greeted;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGreeted(boolean greeted) {
        this.greeted = greeted;
    }
}
