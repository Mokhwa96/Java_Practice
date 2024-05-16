package Java_Basic.Control_Flow_Statements;

public class continue_example {
    public static void main(String[] args)throws Exception {
        for (int i = 0; i < 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

    }
}
