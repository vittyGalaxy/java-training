package section16;

import java.util.regex.Pattern;

public class PatternMatcherExample {
    public void exampleregex() {
        Pattern p = Pattern.compile("\\d");

        //----------------------------------------------------------------------------------------

        String  l = "1. Juventus, 2. Roma, 3. Napoli, 4. Atalanta, 5. Lazio";
        String[] listArray = p.split(l);

        for (int i = 1; i < listArray.length; i++) {
            System.out.println(i + listArray[i].replaceAll(",", ""));
        }

        //----------------------------------------------------------------------------------------
        String text = "info@exampleregex.it";

        boolean match = Pattern.matches(".*@.*", text);
        System.out.println("does the text contain @? " + match);

        //----------------------------------------------------------------------------------------
        System.out.println(p.pattern());

        //----------------------------------------------------------------------------------------
        p = Pattern.compile("EXAMPLE", Pattern.CASE_INSENSITIVE);
        listArray = p.split(text);
        
        for (int i = 1; i <= listArray.length; i++) {
            System.out.println(i + " " + listArray[i-1]);
        }

        //----------------------------------------------------------------------------------------
        System.out.println(p.flags());
    }
}
