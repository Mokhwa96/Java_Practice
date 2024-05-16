package Java_Basic.Control_Flow_Statements;

public class break_example {
    public static void main(String[] args){
        Outer : for( int i =3; i <10; i++){
            for (int j =5; j >0; j--) {
                System.out.println("i " + i + " j " + j);
                if(i==5) {
                    break Outer;
                }
            }
        }
    }
}
