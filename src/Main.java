import section20.src.StringExample;

public class Main {
    public static void main(String[] args) {
        StringExample se = new StringExample();

        int oc = se.countsOccurrences("test Paolo", "m");

        System.out.println(oc);
    }
}