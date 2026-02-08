package section7;

public class Book extends Product{
    private String author;
    private int numPage;

    // getter
    public String getAuthor(){
        return this.author;
    }

    public int getNumPage(){
        return this.numPage;
    }

    // setter
    public void setAuthor(String author){
        this.author = author;
    }

    public void setNumPage(int numPage){
        this.numPage = numPage;
    }
}
