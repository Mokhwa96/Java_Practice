package Object_Oriented_Programming_Fundamentals;
import java.util.Scanner;
public class SimpleCalculatorTest {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("첫 번째 숫자를 입력하세요.");
        String str1 = scan.nextLine();

        System.out.println("사칙연산자를 입력하세요");
        String op = scan.nextLine();

        System.out.println("두 번째 숫자를 입력하세요.");
        String str2 = scan.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result;

        if(op.equals("+")) { // 덧셈 연산
            result = num1 + num2;
        }
        else if(op.equals("-")) { //뺄셈 연산
            result = num1 - num2;
        }
        else if(op.equals("/")) { //나누기 연산
            result = num1 / num2;
        }
        else{
            result = num1 * num2; //곱하기 연산
        }

        System.out.println(str1 + " " + op + " " + str2 + " = " + result); // 결과값 출력
    }
}
