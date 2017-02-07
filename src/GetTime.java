import java.util.*;
import java.text.DateFormat;
/**
 * Created by Gaba on 2017-02-07.
 */
public class GetTime extends Thread {

    public void run(){

        Date rightNow;
        Locale currentLocale;
        DateFormat dateFormatter;
        DateFormat timeFormatter;
        String dateOutput;
        String timeOutput;

        for(int i=1; i<=30; i++){
            rightNow = new Date();
            currentLocale = new Locale("en,""US");
            timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
            dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
            timeOutput = timeFormatter.format(rightNow);
            dateOutput = dateFormatter.format(rightNow);

            System.out.println(timeOutput);
            System.out.println(dateOutput);
            System.out.println();

            try {
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println(e.getClass());
                System.out.println(e.getMessage());

            }
        }
    }
}
