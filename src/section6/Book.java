package section6;

import java.util.ArrayList;
import java.util.List;

public class Book extends Product{
    private String author;

    // getter
    public String getAuthor(){
        return this.author;
    }
    
    // setter
    public void setAuthor(String author){
        this.author = author;
    }

    @Override
    public List<String> getStores(){
        ArrayList<String> t = new ArrayList<String>();

        t.add("shop 3");
        t.add("shop 4");

        return t;
    }
}
