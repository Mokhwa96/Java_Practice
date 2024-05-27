package Object_Oriented_Programming_Advanced;

public class SuperSuper {
    public static void main(String[] args) {
        SubClass subClassInstance = new SubClass();
        subClassInstance.callNum();
    }
}

class SuperClass{
    int count = 20;
}

class SubClass extends SuperClass{
    int count = 15;

    void callNum(){
        System.out.println("count = "+count);
        System.out.println("this.count = " + this.count);
        System.out.println("super.count = " + super.count);
    }
}