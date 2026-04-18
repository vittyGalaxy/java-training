package section20.src;

public class StringExample2 {
    public boolean isPalindroma(String str1) {
        String str2 = "";

        for (int i = str1.length()-1; i >= 0; i--) {
            str2 += str1.charAt(i);
        }

        return str1.equals(str2);
    }

    public int countsOccurrences(String str1, String token) {
        int nOccurrences = 0;
        for (int i = 0; i < str1.length(); i++) {
            String t = str1.substring(i, i+token.length());
            if (t.equals(token)) {
                nOccurrences++;
            }
        }

        return nOccurrences;
    }
}
