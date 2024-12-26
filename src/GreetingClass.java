import java.util.List;

public class GreetingClass {
    public static void main(String[] args) {
        List<String> names = List.of("Aladdin", "Azer", "Samir", "Ibrahim", "Seyidxanım");
        names.stream().forEach(name -> System.out.println("We greet you, Mr." + name + '!'));
    }
}
