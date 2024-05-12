package Methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTime {
    public static void main(String[] args) {
        
        currentDateAndTime();

    }

    static void currentDateAndTime(){

        Date dateTime = new Date();

        SimpleDateFormat dateTimeFormat = new SimpleDateFormat("EEEE LLLL dd, yyyy hh:mm:ss");

        System.out.println("Current date and time: " + dateTimeFormat.format(dateTime));

    }
}
