package Java_Basic.Control_Flow_Statements;

public class while_example2 {
    public static void main(String[] args) {
        boolean run = true;
        int num = 1;

        while(run){ // while(true) 조건문
            num++; //실행문
            System.out.println(num); //실행문

            if(num == 22) { //조건문, num이 22가 되면 탈출! 얏호!
                run = false;
            }
        }
    }
}
