import java.util.List;
import java.util.function.Consumer;

public class FunctionalInterfaceForFormatting {
    public static void main(String[] args) {
        List<String> strings = List.of("salam ", "ayxan", "necesen");
        Consumer<String> consumer = s ->
                System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1, s.length()).toLowerCase());

        formatting(strings, consumer);

    }

    static void formatting(List<String> strings, Consumer<String> consumer) {
        strings.forEach(consumer);
    }
}
