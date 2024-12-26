import java.util.List;

public class ApplyDiscount {
    public static void main(String[] args) {
        List<Double> salaries = List.of(1200d, 230d, 1450d, 600d);
        //first method
        salaries.forEach(salary ->
                System.out.println(salary - (salary * 0.1d)));

        //second method
        List<Double> discountedSalaries = salaries.stream().map(salary -> salary - (salary * 0.1d)).toList();
        System.out.println(discountedSalaries);
    }
}
