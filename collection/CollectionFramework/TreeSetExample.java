package collection.CollectionFramework;
import java.util.*;
public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> workers = new TreeSet<>();

        workers.add("Lee Java");
        workers.add("Park Hacker");
        workers.add("Kim Coding");

        System.out.println(workers);
        System.out.println(workers.first());
        System.out.println(workers.last());
        System.out.println(workers.higher("Lee"));
        System.out.println(workers.subSet("Kim", "Park"));
    }
}
