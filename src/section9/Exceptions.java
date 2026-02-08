package section9;

public class Exceptions {
    private String text;

    public Exceptions(String text){
        setText(text);
    }

    // getter
    public String getText(){
        return this.text;
    }

    // setter
    public void setText(String text){
        this.text = text;
    }

    public void printText(){
        if (this.text != null){
            String t = text.concat("...");
            System.out.println(t);
        } else{
            System.out.println("null");
        }
    }

    public void callPrintText(){
        try{
            printText();

            int val = 10;

            if (this.text != null && this.text.length() < val) {
                System.out.println("the text is less than " + val + " characters");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally executed");
        }
    }

    public void printText2(){
        try {
            printText();
        } catch (Exception e){
            System.out.println(new ExceptionsTest().getMessage());
        }
    }
}
