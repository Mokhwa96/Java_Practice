
import Object_Oriented_Programming_Advanced.package1.Parent;

public class Test2 {
    public static void main(String[] args) {
        Parent p = new Parent();

//        System.out.println(p.a);
//        System.out.println(p.b);
//        System.out.println(p.c);
        System.out.println(p.d);
    }
}

class Child extends Parent{
    public void printEach() {
//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
