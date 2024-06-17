package Object_Oriented_Programming_Advanced.Abstraction;

public class InterfaceExample {
    public static void main(String[] args) {
        User user = new User();
        user.callProvider(new Provider2());
    }
}

class User {
    public void callProvider(Provider2 provider) {
        provider.call();
    }
}

class Provider2 {
    public void call() {
        System.out.println("야호~");
    }
}