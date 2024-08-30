package ref;

public class Method3 {
    public static void main(String[] args) {
        Student student1 = creatStudent1("강민석", 25, 100);
        print(student1);
    }

    private static void print(Student student) {
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " +student.grade);
    }

    private static Student creatStudent1(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
}
