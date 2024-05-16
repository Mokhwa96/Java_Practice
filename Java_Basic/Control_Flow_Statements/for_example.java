package Java_Basic.Control_Flow_Statements;

public class for_example {
    public static void main(String[] args){
        int sum =0;
        //for (초기화; 조건식; 증감식)
        for (int num = 0; num < 10; num++){
        sum += num;
        }
        System.out.println(sum);
    }
}
