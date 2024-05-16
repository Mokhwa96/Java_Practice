package Java_Basic.Control_Flow_Statements;

public class while_example {
    public static void main(String[] args){
        int num = 0, sum = 0;
        while(num<= 10){
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
