package section16;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherExample {
    public void examplePattern() {
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

    public void exampleMatcher() {
        String text = 
                "<h1>Title</h1>"    +
                "<p> Text A </p>"   +
                "<hr/>"             +
                "<p> Text B</p>"    +
                "<h2> Title 2</h2>" +
                "<p> Text C</p>";
        
        String regex = "(<p>([^<]+)</p>)";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);

        System.out.println("groups present in the regular expression " + regex + ": " + m.groupCount());
        
        System.out.println(text);
        System.out.println("------------------------");
        System.out.println("FIRST ITERATION");
        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println("------------------------");
        }

        System.out.println("SECOND ITERATION");

        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println("------------------------");
        }

        m.reset();
        
        System.out.println("THIRD ITERATION");

        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.group(1));
            System.out.println(m.group(2));
            System.out.println("------------------------");
        }
    }
}
