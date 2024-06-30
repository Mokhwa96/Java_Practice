import java.util.Arrays;

public class TerminalOperationExample3 {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        long sum = Arrays.stream(intArray).sum();
        System.out.println("intArray 전체 요소 합: "+ sum);

        int sum1 = Arrays.stream(intArray)
                .map(element->element *2)
                .reduce((a,b)->a+b)
                .getAsInt();
        System.out.println("초기값이 없는 reduce(): " + sum1);

        int sum2 =Arrays.stream(intArray)
                .map(element -> element *2)
                .reduce(5, (a,b) -> a+b);
        System.out.println("초기값이 있는 reduce(): " + sum2);
    }
}
