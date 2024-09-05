package lesson19.Main.Months;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Month currentMonth = getCurrentMonth();
        Season currentSeason = getSeason(currentMonth);
        System.out.println("Current month: " + currentMonth);
        System.out.println("Current season: " + currentSeason);
    }

    public static Month getCurrentMonth() {
        int monthValue = LocalDate.now().getMonthValue();
        return Month.values()[monthValue - 1];
    }

    public static Season getSeason(Month month) {
        return switch (month) {
            case DECEMBER, JANUARY, FEBRUARY -> Season.WINTER;
            case MARCH, APRIL, MAY -> Season.SPRING;
            case JUNE, JULY, AUGUST -> Season.SUMMER;
            case SEPTEMBER, OCTOBER, NOVEMBER -> Season.AUTUMN;
        };
    }
}
