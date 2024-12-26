import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> integers = List.of(12, 24, 17, 89, 87, 84);
        List<Integer> evenList = integers.stream().filter(num -> num % 2 == 0).toList();
        System.out.println(evenList);

        integers.stream().filter(num -> num % 2 == 0).forEach(System.out::println);
    }
}
