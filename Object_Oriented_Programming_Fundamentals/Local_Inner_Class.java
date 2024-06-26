package Object_Oriented_Programming_Fundamentals;

public class Local_Inner_Class {
    public static void main(String[] args) {
        Outer_3 outer = new Outer_3();
        outer.test();
    }
}
class Outer_3 { //외부 클래스
    int num = 5;
    void test() {
        int num2 = 6;
        class LocalInClass { //지역 내부 클래스
            void getPrint() {
                System.out.println(num);
                System.out.println(num2);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}