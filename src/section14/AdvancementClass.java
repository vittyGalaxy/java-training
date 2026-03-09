package section14;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class AdvancementClass extends Thread {
    private JLabel label;
    private String sharedResource;

    public AdvancementClass(String sharedResource, String barName) {
        this.sharedResource = sharedResource;
        this.setName(barName);

        label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    public JLabel matters() {
        return label;
    }

    @Override
    public void run() {
        int counter = 0;
        while (true) {
            synchronized (this.sharedResource) {
                if (counter == 50) {
                    counter = 0;
                }

                label.setText(" - " + this.getName() + ": " + ++counter + " - ");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
