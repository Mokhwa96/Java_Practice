package Java_Basic.input_output;

public class output {
    public static void main(String[] args){
//        System.out.print("Hello JAVA, ");
//        System.out.print("Mokhwa" + "Latte, ");
//        System.out.print(3+2 + "month,");
//        System.out.print(2024 + "year");
//        System.out.println("");
//        System.out.println("Hello JAVA, ");
//        System.out.println("Mokhwa" + "Latte, ");
//        System.out.println(3+2 + "month,");
//        System.out.println(2024 + "year");
        System.out.printf("%s%n", "Hello JAVA"); // 줄 바꿈이 됩니다.
        System.out.printf("%s%n", "Mokhwa" + "Latte");
        System.out.printf("%d%n", 3+6);
        System.out.printf("지금은 %s입니다%n", 2024 + "year"); // 자동 타입 변환이 일어납니다.
        System.out.printf("나는 %c%s입니다%n",'목', "화랏에"); //여러 개의 인자를 넣을 수 있습니다.
    }
}
