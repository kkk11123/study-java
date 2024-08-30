package ref;

public class Student1Main {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student(student1,"학생1", 15, 80);
        print(student1);


        Student1 student2 = new Student1();
        student(student2, "학생2", 15, 90);
        print(student2);

    }

    private static void print(Student1 student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }

    private static void student(Student1 student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

}
