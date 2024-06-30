import java.util.Arrays;
import java.util.List;

public class IntermediateOperationExample3 {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Tiger","Lion","Money","Duck","Horse","Cow");

        animals.stream().sorted().forEach(System.out::println);
    }
}
