package lesson14.Mentor.TimeDifferenceCalculator;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeCalculator {
    public void calculateDifference(int hour1, int minute1, int hour2, int minute2) {
        int hourDifference = Math.abs(hour2 - hour1);
        int minuteDifference = Math.abs(minute2 - minute1);

        System.out.println("There is " + hourDifference + " hour " + minuteDifference + " minutes difference.");
    }

    public void calculateDifference(String time1, String time2) {
        if (isValidTimeFormat(time1) && isValidTimeFormat(time2)) {
            // Parse strings
            LocalTime parsedTime1 = LocalTime.parse(time1, DateTimeFormatter.ofPattern("HH:mm"));
            LocalTime parsedTime2 = LocalTime.parse(time2, DateTimeFormatter.ofPattern("HH:mm"));

            int hourDifference = Math.abs(parsedTime2.getHour() - parsedTime1.getHour());
            int minuteDifference = Math.abs(parsedTime2.getMinute() - parsedTime1.getMinute());

            System.out.println("There is " + hourDifference + " hour " + minuteDifference + " minutes difference.");
        } else {
            System.out.println("Invalid time format. Please use the time format HH:mm.");
        }
    }

    // Method to validate time format
    private boolean isValidTimeFormat(String time) {
        return time.matches("\\d{2}:\\d{2}");
    }
}
