package section17;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateClass {
    public void exampleDate() {
        Date data = new Date();

        System.out.println(data.getTime());
        System.out.println(data.toString());
    }

    public void exampleCalendar() {
        Calendar c = new GregorianCalendar();
        c.setTime(new Date());

        System.out.println(c.get(Calendar.YEAR));
        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, 10);
        c.set(Calendar.DATE, 29);
        System.out.println(c.get(Calendar.DAY_OF_WEEK));

        System.out.println(c.getTime());
    }

    public void exampleLocalDate() {
        LocalDate ld = LocalDate.of(2017, 3, 29);

        System.out.println(ld.isLeapYear());
        System.out.println(ld.lengthOfMonth());
        System.out.println(ld.getDayOfWeek());

        LocalDate ld2 = ld.withYear(2015);
        System.out.println(ld2.toString());

        LocalDate ld3 = ld.plusMonths(3);
        System.out.println(ld3.toString());
    }

    public void exampleLocalTime() {
        LocalTime lt1 = LocalTime.of(9, 30);
        LocalTime lt2 = LocalTime.of(13, 30);
        
        LocalTime lt3 = LocalTime.of(15, 30);
        LocalTime lt4 = LocalTime.of(19, 30);
        
        System.out.println(lt1.toString());
        System.out.println(lt2.toString());
        System.out.println(lt3.toString());
        System.out.println(lt4.toString());
    }
}
