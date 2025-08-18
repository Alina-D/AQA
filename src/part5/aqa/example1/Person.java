package part5.aqa.example1;

public class Person {
    private String fullName;
    private int age;

    public Person () {}

    public Person (String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(this.fullName + " двигается");
    }

    public void talk() {
        System.out.println(this.fullName + " говорит");
    }
}
