import java.util.List;

public class Student {

    private String name;
    private int age;
    private double height;
    List<Student>students;
    public static void verb(){
        System.out.println("Коледжде окушат");
    }

    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
