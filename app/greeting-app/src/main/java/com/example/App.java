package com.example;

import java.time.LocalTime;

public class App {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        String greeting = getGreeting(currentTime);
        System.out.println(greeting);
    }

    private static String getGreeting(LocalTime time) {
        int hour = time.getHour();
        int minute = time.getMinute();

        if (hour >= 0 && hour < 12) {
            return "Good morning!";
        } else if (hour >= 12 && hour < 17) {
            return "Good afternoon!";
        } else if (hour >= 17 && (hour != 23 || minute != 59)) {
            return "Good evening!";
        } else {
            return "Good night!";
        }
    }
}
