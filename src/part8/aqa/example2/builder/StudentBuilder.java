package part8.aqa.example2.builder;

public class StudentBuilder implements Builder{

    private String name;
    private int age;
    private String university;

    @Override
    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder setUniversity(String university) {
        this.university = university;
        return this;
    }

    public Student getResult () {
        return new Student(this.name, this.age, this.university);
    }

    @Override
    public String toString() {
        return "StudentBuilder{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", university='" + university + '\'' +
                '}';
    }
}
