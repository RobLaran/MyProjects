package DateAndTime.FormatDateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Before Formatting Date and Time: " + dateTime);

        DateTimeFormatter formatting = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String dateFormatted = dateTime.format(formatting);

        System.out.println("Newly Date and Time Format: " + dateFormatted);
    }
}
