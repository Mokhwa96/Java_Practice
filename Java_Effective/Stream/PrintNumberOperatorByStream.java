import java.util.*;
import java.util.stream.*;

public class PrintNumberOperatorByStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
    }
}
