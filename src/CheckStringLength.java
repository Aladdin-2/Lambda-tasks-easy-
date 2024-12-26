import java.util.List;
import java.util.function.Predicate;

public class CheckStringLength {
    public static void main(String[] args) {
        //first method
        Predicate<List<String>> stringList = strings ->
                strings.stream().allMatch(str -> str.length() >= 5);
        List<String> strings = List.of("Aladdin", "Biyabangerd", "Velei", "Aliyev");
        System.out.println(stringList.test(strings));
        System.out.println("===============");

        strings.stream().filter(str -> str.length() >= 5).forEach(System.out::println);
    }
}
