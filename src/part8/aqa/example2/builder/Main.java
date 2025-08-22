package part8.aqa.example2.builder;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new StudentBuilder();
        Student student1 = studentBuilder.setName("Василий").setAge(18).getResult();
        System.out.println(student1.toString());

        StudentBuilder studentBuilder2 = new StudentBuilder();
        Student student2 = studentBuilder2.setUniversity("Университет").getResult();
        System.out.println(student2.toString());
    }
}
