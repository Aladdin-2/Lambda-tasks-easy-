import java.util.List;
import java.util.function.Consumer;

public class LogUserActivity {
    public static void main(String[] args) {
        //first method
        Consumer<List<String>> listConsumer = strings -> {
            strings.stream().forEach(str -> System.out.println("Activity:" + str));
        };
        List<String> activities = List.of("Login", "Register");
        listConsumer.accept(activities);
        System.out.println("===========================");

        //second method

        Consumer<String> stringConsumer = str -> System.out.println("Activity:" + str);
        activity(activities, stringConsumer);
    }

    public static void activity(List<String> strings, Consumer<String> consumer) {
        strings.forEach(consumer);
    }
}
