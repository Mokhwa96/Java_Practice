package Java_Effective.Lambda;

public class LamdaExample1 {
    public static void main(String[] args) {
        /* Object obj = new Object() {
            int sum(int num1, int num2) {
                return num1 + num1;
            }
        };
        */
        ExampleFunction exampleFunction = (num1, num2) -> num1 + num2;
        System.out.println(exampleFunction.sum(10, 15));
    }

    @FunctionalInterface // 컴파일러가 인터페이스가 바르게 정의되었는지 확인하도록 합니다.
    interface ExampleFunction {
        int sum(int num1, int num2);
    }
}