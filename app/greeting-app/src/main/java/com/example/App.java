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
            return "Good morning Zobaer Welcome to COMP367!";
        } else if (hour >= 12 && hour < 17) {
            return "Good afternoon Zobaer Welcome to COMP367!!";
        } else if (hour >= 17 && (hour != 23 || minute != 59)) {
            return "Good evening Zobaer Welcome to COMP367!!";
        } else {
            return "Good night Zobaer Welcome to COMP367!!";
        }
    }
}
