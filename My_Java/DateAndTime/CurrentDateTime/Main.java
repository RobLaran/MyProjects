package DateAndTime.CurrentDateTime;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current date and time: " + dateTime);
    }
}
