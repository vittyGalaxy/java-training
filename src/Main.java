import section13.WritingClass;
import section13.BufferClass;

public class Main {

    public static void main(String[] args){
        String dir = "path";

        WritingClass w = new WritingClass();
        w.exampleFileWriter(dir + "file_writer.txt", "text");

        BufferClass b = new BufferClass();
        b.exampleBufferedFileWriter(dir + "buffered-writer.txt", new String[] {"Paolo", "Preite", "Java Course", "Advanced!"});
    }
}
