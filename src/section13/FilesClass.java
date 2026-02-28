package section13;

import java.io.File;
import java.io.IOException;

public class FilesClass {
    public void createFiles(String path){
        File f = new File(path);

        if(!f.exists()){
            try{
                f.createNewFile();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public void createDirectory(String path){
        File d = new File(path);

        if(!d.exists()){
            d.mkdir();
        }
    }
}
