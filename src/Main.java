import section17.DateClass;

public class Main {
    public static void main(String[] args) {
        DateClass dc = new DateClass();
        
        System.out.println("---------------------------------------------------------------");
        dc.exampleDate();

        System.out.println("---------------------------------------------------------------");
        dc.exampleCalendar();

        System.out.println("---------------------------------------------------------------");
        dc.exampleLocalDate();
        
        System.out.println("---------------------------------------------------------------");
        dc.exampleLocalTime();

        System.out.println("---------------------------------------------------------------");
        dc.examplePeriodDuration();
        
        System.out.println("---------------------------------------------------------------");
        dc.exampleSimpleDateFormat();
    }
}