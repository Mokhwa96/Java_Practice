import java.util.Arrays;
import java.util.List;

public class IntermediateOperationExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kimcoding","javalee","hackerna","luckguy");
        names.stream()
                .map(element->element.toUpperCase())
                .forEach(element-> System.out.println(element));
    }
}
