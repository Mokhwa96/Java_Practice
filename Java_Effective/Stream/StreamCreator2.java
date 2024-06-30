import java.util.Arrays;
import java.util.stream.IntStream;


public class StreamCreator2 {

    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7};
        IntStream intStream = Arrays.stream(intArr);

        System.out.println("sum=" + intStream.sum());
    }
}
