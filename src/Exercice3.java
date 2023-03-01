import java.util.Arrays;
import java.util.List;

public class Exercice3 {
    public static void execute() {
        //Prior Java 8 :
        List<String> features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
        for (String feature : features) {
            System.out.println(feature);
        }

        features.forEach(System.out::println);
    }
}
