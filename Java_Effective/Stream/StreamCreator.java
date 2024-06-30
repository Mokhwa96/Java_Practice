import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {
        String[] arr = new String[]{"김코딩","이지바","박해커"};

        Stream<String> stream = Stream.of(arr);

        stream.forEach(System.out::println);
    }
}
