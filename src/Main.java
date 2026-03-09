import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

import section14.AdvancementClass;
import section14.CurrentAccountClass;
import section14.LivelockClass;
import section14.People;
import section14.StarvationClass;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final CurrentAccountClass c1 = new CurrentAccountClass(1, 500d);
        final CurrentAccountClass c2 = new CurrentAccountClass(2, 500d);

        Thread t1 = new Thread() {
            public void run() {
                CurrentAccountClass.transfer(c1, c2, 25d);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                CurrentAccountClass.transfer(c1, c2, 30d);
            }
        };

        // start
        t1.start();
        t2.start();


        // Starvation
        JFrame frame = new JFrame("example starvation");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(1024, 300));
        frame.setLayout(new FlowLayout(FlowLayout.LEFT));

        for (int i = 1; i <=10; i++) {
            AdvancementClass thread = new AdvancementClass(StarvationClass.sharedResource, "Thread " + i);
            frame.add(thread.matters());
            thread.start();
        }

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        // Livelock
        LivelockClass p1 = new LivelockClass(new People("Antonio"), new People("Paolo"));
        LivelockClass p2 = new LivelockClass(new People("Paolo"), new People("Antonio"));

        new Thread(p1).start();
        new Thread(p2).start();
    }
}