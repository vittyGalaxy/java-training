package section14;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CurrentClass {
    private static CurrentClass cc;

    public static CurrentClass getInstance() {
        if (cc == null) {
            cc = new CurrentClass();
        }

        return cc;
    }

    public double getBalance() {
        double balance = 0;

        BufferedReader br = null;
        try {
            File fin = new File(new File(".").getCanonicalFile() + File.separator + "db,txt");

            br = new BufferedReader(new FileReader(fin));
            String line = null;
            while ((line = br.readLine()) != null){
                balance = Double.parseDouble(line);
                break;
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (br != null){
                try {
                    br.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }

        return balance;
    }

    public synchronized void withdrawal(double sum) throws Exception {
        Thread.sleep(5000);

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            double newBalance = getBalance() - sum;

            if (newBalance > 0){
                fw = new FileWriter(new File(".").getCanonicalPath() + File.separator + "db.txt");
                bw = new BufferedWriter(fw);
                bw.write(newBalance + "");
            } else {
                throw new Exception("Insufficient balance!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public void withdrawalNotSync(double sum) throws Exception {
        Thread.sleep(5000);

        BufferedWriter bw = null;
        FileWriter fw = null;

        try {
            double newBalance = getBalance() - sum;

            if (newBalance > 0){
                fw = new FileWriter(new File(".").getCanonicalPath() + File.separator + "db.txt");
                bw = new BufferedWriter(fw);
                bw.write(newBalance + "");
            } else {
                throw new Exception("Insufficient balance!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
