package section13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferClass {
    public void exampleBufferedFileWriter(String filePath, String[] text){
        File file = new File(filePath);

        if(!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e){
                e.getStackTrace();
            }
        }

        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file));

            for (String string : text){
                bw.write(string);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bw.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        
    }
}
