import java.util.stream.IntStream;

public class IntermediateOperationExample4 {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1,10);

        intStream.skip(5).forEach(System.out::println);
    }
}
