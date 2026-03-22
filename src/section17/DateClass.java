package section17;

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
}
