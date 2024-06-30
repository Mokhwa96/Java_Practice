import java.util.Arrays;

public class TerminalOperationExample {
    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};

        long count = Arrays.stream(intArray).count();
        System.out.println("intArr의 전체 요소 개수 " + count);

        long sum  = Arrays.stream(intArray).sum ();
        System.out.println("intArr의 전체 요소 합 " + sum );

        double average = Arrays.stream(intArray).average().getAsDouble();
        System.out.println("intArr의 전체 요소의 평균값 " + average);

        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("intArr의 최대값 " + max);

        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println("intArr의 최소값 " + min);

        int first  = Arrays.stream(intArray).findFirst().getAsInt();
        System.out.println("intArr의 첫번째 요소 " + first);

    }
}
