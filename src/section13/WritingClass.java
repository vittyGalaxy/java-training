package section13;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritingClass {
    public void exampleFileWriter(String filePath, String text){
        File file = new File(filePath);

        if(!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e){
                e.getStackTrace();
            }
        }

        FileWriter fw = null;
        try{
            fw = new FileWriter(file);
            fw.write(text);
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fw.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void examplePrintWriter(String filePath, String[] text) throws IOException{
        File file = new File(filePath);

        if(!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e){
                e.getStackTrace();
            }
        }

        PrintWriter pw = null;

        try {
            pw = new PrintWriter(new FileWriter(file));
            for(String string : text){
                pw.write(string);
                pw.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }
    }
}
