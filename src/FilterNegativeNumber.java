import java.util.List;
import java.util.function.Predicate;

public class FilterNegativeNumber {
    public static void main(String[] args) {

        List<Integer> integers = List.of(12, -3, -34, 123, -4);

        Predicate<Integer> isPositive = number -> number >= 0;

        printPositiveNumbers(integers, isPositive);

    }

    public static void printPositiveNumbers(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream().filter(predicate).forEach(System.out::println);
    }
}
