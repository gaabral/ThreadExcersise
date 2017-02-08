import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Gaba on 2017-02-08.
 */
public class GetSystemTime implements Runnable{
    @Override
    public void run() {
        Date rightNow = new Date();
        Locale currentLocale = new Locale("en","US");
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
        String  timeOutput = timeFormatter.format(rightNow);
        String dateOutput = dateFormatter.format(rightNow);

        System.out.println(timeOutput);
        System.out.println(dateOutput);
        System.out.println();
    }
}
