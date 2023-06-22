import spark.Spark;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GreetingApp {
    public static void main(String[] args) {
        Spark.port(8081);

        Spark.get("/", (request, response) -> {
            String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());
            String greeting;

            int hour = Integer.parseInt(currentTime.substring(0, 2));

            if (hour >= 5 && hour < 12) {
                greeting = "Good morning Zobaer Welcome to COMP367";
            } else if (hour >= 12 && hour < 18) {
                greeting = "Good afternoon Zobaer Welcome to COMP367";
            } else {
                greeting = "Good evening Zobaer Welcome to COMP367";
            }

            return greeting;
        });
    }
}
