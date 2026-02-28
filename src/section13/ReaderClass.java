package section13;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReaderClass {
    public void exampleFileReader(String filePath){
        File f = new File(filePath);

        if(!f.exists()) {
            FileReader fr = null;
            try {
                fr = new FileReader(f);

                char[] text = new char[1024];
                int size = fr.read(text);

                for (int i = 0; i < size; i++){
                    System.out.println(text[i]);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public void exampleBufferedReader(String filePath){
        File f = new File(filePath);

        if(!f.exists()) {
            BufferedReader fr = null;
            try {
                fr = new BufferedReader(new FileReader(f));

                char[] text = new char[1024];
                int size = fr.read(text);

                for (int i = 0; i < size; i++){
                    System.out.println(text[i]);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
