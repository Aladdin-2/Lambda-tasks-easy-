import java.util.List;
import java.util.function.Predicate;

public class CheckPalindrome {
    public static void main(String[] args) {
        List<String> strings = List.of("hello", "ana");

        Predicate<String> predicate = str -> {
            String palindrome = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(palindrome);
        };

        checkPalindrome(strings, predicate);
    }

    public static void checkPalindrome(List<String> strings, Predicate<String> predicate) {
        strings.stream().filter(predicate).forEach(System.out::println);
    }

}