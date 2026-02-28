import section13.FilesClass;
import java.io.File;

public class Main {

    public static void main(String[] args){
        FilesClass f1 = new FilesClass();
        String path = "path";
        String file = path + "name_file.txt";

        f1.createDirectory(path);
        f1.createFiles(file);

        File d = new File(path);
        System.out.println(d.isDirectory());

        File f2 = new File(file);
        System.out.println(f2.isFile());

        File[] files = d.listFiles();

        for(File file2: files){
            System.out.println(file2.getName());

            file2.delete();
        }
    }
}
