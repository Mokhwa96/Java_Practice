package collection.CollectionFramework;
import java.util.*;
public class HashSet_test {
    public static void main(String[] args) {
        HashSet<String> languages = new HashSet<String>();

        // HashSet에 객체 추가
        languages.add("Java");
        languages.add("Python");
        languages.add("Javascript");
        languages.add("C++");
        languages.add("Kotlin");
        languages.add("Ruby");
        languages.add("Java"); // 중복

        Iterator it = languages.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
