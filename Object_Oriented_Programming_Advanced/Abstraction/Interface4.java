package Object_Oriented_Programming_Advanced.Abstraction;
interface Cover{
    public abstract void call();
}

public class Interface4 {
    public static void main(String[] args) {
        User2 user = new User2();
        user.callProvider(new Provider3());
    }
}
class User2 {
    public void callProvider(Cover cover){
        cover.call();
    }
}

class Provider implements Cover{
    public void call() {
        System.out.println("무야호~");
    }
}

class Provider3 implements Cover {
    public void call() {
        System.out.println("야호~");
    }
}