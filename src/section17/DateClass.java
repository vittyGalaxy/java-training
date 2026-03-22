package section17;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
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

    public void examplePeriodDuration() {
        Duration d1 = Duration.ofSeconds(10, 40);

        System.out.println(d1.getSeconds());
        System.out.println(d1.getNano());

        LocalTime lt1 = LocalTime.of(9, 30);
        LocalTime lt2 = LocalTime.of(13, 30);

        Duration d2 = Duration.between(lt1, lt2);
        System.out.println(d2.getSeconds());
        System.out.println(d2.getNano());
    }

    public void exampleSimpleDateFormat() {
        Calendar c = new GregorianCalendar();
        c.set(Calendar.YEAR, 2017);
        c.set(Calendar.MONTH, 4);
        c.set(Calendar.DATE, 29);
        c.set(Calendar.HOUR, 10);
        c.set(Calendar.MINUTE, 30);
        c.set(Calendar.SECOND, 25);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String date = sdf.format(c.getTime());

        System.out.println(date);

        sdf = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        date = sdf.format(c.getTime());
        System.out.println(date);

        try {
            Date d = sdf.parse("01/02/2017 - 23:10:24");
            System.out.println(d.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
