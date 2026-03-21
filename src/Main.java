import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import section15.UserClass;

public class Main {
    public static void main(String[] args) {
        String text = "This text is used to give an example to learn ABCDEFGHIJKLMNOPQRSTUVWXYZ  LLLLLLLLLLLL";

        // [...]
        System.out.println(text.replaceAll("[aeiou]", "H"));

        // [^...]
        System.out.println(text.replaceAll("[^aeiou]", "H"));

        // [...-...]
        System.out.println(text.replaceAll("[a-e]", "H"));

        // [...&&[...]]
        System.out.println(text.replaceAll("[A-Z&&[L]]", "H"));

        // .
        System.out.println(text.replaceAll(".", "H"));

        // [...+[...]]
        System.out.println(text.replaceAll("[A-Z+[a-z]]", "K"));

        // ^[...]
        System.out.println(text.replaceAll("^[A-Z]", "K"));
        System.out.println(text.replaceAll("^[a-z]", "K"));

        // [...]$
        System.out.println(text.replaceAll("[A-Z]$", "K"));
        System.out.println(text.replaceAll("[a-z]$", "K"));
        
        // a*
        System.out.println(text.replaceAll("a*", "H"));

        // a{n}
        System.out.println(text.replaceAll("L{2}", "H"));

        // a{n,}
        System.out.println(text.replaceAll("L{2,}", "H"));

        // a{n,m}
        System.out.println(text.replaceAll("L{2,4}", "H"));

        // \d
        System.out.println(text.replaceAll("\\d", "H"));

        // \\D
        System.out.println(text.replaceAll("\\D", "H"));
        
        // \\s
        System.out.println(text.replaceAll("\\s", "H"));
        
        // \\S
        System.out.println(text.replaceAll("\\S", "H"));
        
        // \\w
        System.out.println(text.replaceAll("\\w", "H"));
        
        // \\W
        System.out.println(text.replaceAll("\\W", "H"));
    }
}