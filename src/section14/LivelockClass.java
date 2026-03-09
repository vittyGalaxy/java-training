package section14;

public class LivelockClass implements Runnable {
    private People p1;
    private People p2;

    public LivelockClass(People p1, People p2) {
        super();
        this.setP1(p1);
        this.setP2(p2);
    }

    @Override
    public void run() {
        getP1().greeted(getP2());
    }

    // getter
    public People getP1() {
        return this.p1;
    }

    public People getP2() {
        return this.p2;
    }

    // setter
    public void setP1(People p) {
        this.p1 = p;
    }

    public void setP2(People p) {
        this.p2 = p;
    }
}
