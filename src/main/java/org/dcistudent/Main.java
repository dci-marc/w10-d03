package org.dcistudent;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        exercise1();
        exercise2();
    }

    private static void exercise1() {
        String dateString = "2011-11-20";
        LocalDate date = LocalDate.parse(dateString);
        LocalDate today = LocalDate.now();

        if (today.isAfter(date)) {
            System.out.println("chosen date is after today");
            return;

        }

        System.out.println("today is after chosen date");
    }

    private static void exercise2() {
        String timeString = "20:10:11";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH//mm//ss");
        System.out.println(LocalTime.parse(timeString).format(formatter));
    }
}