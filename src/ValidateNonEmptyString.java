import java.util.List;

public class ValidateNonEmptyString {
    public static void main(String[] args) {
        List<String> strings = List.of("Gəncə", "", "Bakı", "Siyəzən", "");
        //First method
        strings.stream().filter(str -> !str.isEmpty()).forEach(System.out::println);
        System.out.println("==========================================");
        //Second method
        strings.stream().filter(str -> !str.isEmpty()).forEach(str -> System.out.println(str));
        System.out.println("==========================================");
        //Third method
        List<String> nonEmptyStrings = strings.stream().filter(str -> !str.isEmpty()).toList();
        System.out.println(nonEmptyStrings);

    }
}
