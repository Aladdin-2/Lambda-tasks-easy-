import java.util.List;
import java.util.function.Predicate;

public class Validate {
    public static void main(String[] args) {
        List<String> names = List.of("Aladdin", "Azer", "Samir", "Ibrahim", "Seyidxanım");
        //first method
        names.stream().filter(name -> name.length() >= 6).forEach(System.out::println);
        System.out.println("==========================");
        //second method
        List<String> validateNames = names.stream().filter(name -> name.length() >= 6).toList();
        System.out.println(validateNames);
        System.out.println("==========================");
        //third method
        Predicate<String> validateName = name -> name.length() >= 6;
        System.out.println(names.stream().filter(validateName).toList());
    }
}
