package part8.aqa.example2.builder;

public class Student {
    private String name;
    private int age;
    private String university;

    public Student(String name, int age, String university) {
        this.name = name;
        this.age = age;
        this.university = university;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
