import java.util.List;
import java.util.function.Consumer;

public class PerformCalculate {
    public static void main(String[] args) {

        List<Integer> numberList = List.of(12, 33, 45, 2, 2, 4, 5);
//first method
        Consumer<List<Integer>> calculateSquare = numbers -> {
            numbers.forEach(number -> {
                System.out.println("Old number: " + number);
                System.out.println("Square of a number: " + number * number);
                System.out.println();
            });
        };
        calculateSquare.accept(numberList);
        System.out.println("=======================");

        //second method
        numberList.forEach(number -> {
            System.out.println("Old number: " + number);
            System.out.println("Square of a number: " + number * number);
        });
    }
}
