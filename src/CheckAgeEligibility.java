import java.util.List;

public class CheckAgeEligibility {
    public static void main(String[] args) {
        List<Integer> ages = List.of(12, 45, 18, 20, 19, 35, 27, 17, 15);
        ages.stream().filter(age -> age >= 18).forEach(age-> System.out.print(age+" "));
        System.out.println("\n=====================");
        List<Integer> suitableAges = ages.stream().filter(age -> age >= 18).toList();
        System.out.println(suitableAges);

    }
}
