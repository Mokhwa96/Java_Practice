import java.util.Arrays;
import java.util.List;

public class IntermediateOperationExample2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,6,9);

        list.stream().map(number -> number *3).forEach(System.out::println);
    }
}
