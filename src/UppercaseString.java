import java.util.List;

public class UppercaseString {
    public static void main(String[] args) {
        List<String> strings = List.of("word", "excel", "paint", "canva");
        //first method
        strings.stream().forEach(uppercase -> System.out.println(uppercase.toUpperCase()));
        System.out.println("======================");
        //second method
        List<String> uppercaseStrings = strings.stream().map(string -> string.toUpperCase()).toList();
        System.out.println(uppercaseStrings);
    }
}
