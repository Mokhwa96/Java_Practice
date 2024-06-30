import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TerminalOperationExample4 {
    public static void main(String[] args) {
        List<Student> totalList = Arrays.asList(
                new Student("김코딩", 100, Student.Gender.Male),
                new Student("박해커", 80, Student.Gender.Male),
                new Student("이자바", 90, Student.Gender.Female),
                new Student("나미녀", 60, Student.Gender.Female)
        );

        Map<String, Integer> maleMap = totalList.stream()
                .filter(s -> s.getGender() == Student.Gender.Male)
                .collect(Collectors.toMap(
                        student ->student.getName(),
                        student ->student.getScore()
                ));
        System.out.println(maleMap);
    }
}
class Student{
    public enum Gender {Male, Female};
    private String name;
    private int score;
    private Gender gender;

    public Student(String name, int score, Gender gender) {
        this.name =name;
        this.score = score;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Gender getGender() {
        return gender;
    }
}