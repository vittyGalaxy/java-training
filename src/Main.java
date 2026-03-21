import section16.PatternMatcherExample;

public class Main {
    public static void main(String[] args) {
        PatternMatcherExample pme = new PatternMatcherExample();
        System.out.println(pme.emailValidator("example@gmail.com"));
        System.out.println(pme.emailValidator("examplegmail.com"));
        System.out.println(pme.emailValidator("example@gmailcom"));
        System.out.println(pme.emailValidator("example@gmail"));
        System.out.println(pme.emailValidator("example"));

        System.out.println("------------------------------------------------------------------------------");

        System.out.println(pme.dateFormatValidator("10/12/2016"));
        System.out.println(pme.dateFormatValidator("10-12-2016"));
        System.out.println(pme.dateFormatValidator("31-12-2016"));
        System.out.println(pme.dateFormatValidator("31-12-1899"));
        System.out.println(pme.dateFormatValidator("10\\12\\2016"));
        System.out.println(pme.dateFormatValidator("2016/02/14"));
        System.out.println(pme.dateFormatValidator("12/2016"));
        System.out.println(pme.dateFormatValidator("dd/mm/yyyy"));

        System.out.println("------------------------------------------------------------------------------");

        System.out.println(pme.TaxIdCode("PRTPPP77P15H501K"));
        System.out.println(pme.TaxIdCode("PRTPPP77P15H501KPOOI"));
        System.out.println(pme.TaxIdCode("PRTPPP77P15H"));
    }
}