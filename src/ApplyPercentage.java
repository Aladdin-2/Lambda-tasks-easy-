import java.util.List;
import java.util.function.Consumer;

public class ApplyPercentage {
    public static void main(String[] args) {
        List<Double> prices = List.of(12d, 125.0, 45d);

        Consumer<Double> consumer = price -> {
            double newPrice = price + (price * 0.05);
            System.out.println("Old price: " + price);
            System.out.println("New price: " + newPrice);
        };
        applyPercentage(prices, consumer);

    }

    public static void applyPercentage(List<Double> prices, Consumer<Double> consumer) {
        prices.forEach(consumer);
    }
}
