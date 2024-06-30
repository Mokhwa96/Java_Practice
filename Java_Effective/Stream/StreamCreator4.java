import java.util.Random;
import java.util.stream.IntStream;

public class StreamCreator4 {
    public static void main(String[] args) {

        IntStream ints = new Random().ints(5);

        ints.forEach(System.out::println);
    }
}
