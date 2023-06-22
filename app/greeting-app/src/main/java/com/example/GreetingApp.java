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
                greeting = "Good morning";
            } else if (hour >= 12 && hour < 18) {
                greeting = "Good afternoon";
            } else {
                greeting = "Good evening";
            }

            return greeting;
        });
    }
}
