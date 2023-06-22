package com.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.time.LocalTime;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class App {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8081), 0);
        server.createContext("/", new GreetingHandler());
        server.start();
        System.out.println("Server started on port 8081");
    }

    static class GreetingHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            LocalTime currentTime = LocalTime.now();
            String greeting = getGreeting(currentTime);

            exchange.sendResponseHeaders(200, greeting.length());
            OutputStream responseBody = exchange.getResponseBody();
            responseBody.write(greeting.getBytes());
            responseBody.close();
        }
    }

    private static String getGreeting(LocalTime time) {
        int hour = time.getHour();

        if (hour >= 0 && hour < 12) {
            return "Good morning Zobaer welcome to COMP367!";
        } else if (hour >= 12 && hour < 18) {
            return "Good afternoon Zobaer welcome to COMP367!!";
        } else if {
            return "Good evening Zobaer welcome to COMP367!!";
        }
        else{
          "Good Night Zobaer welcome to COMP367!!";  
        }
    }
}
