package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);
        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student1){    //변수를 여러개 사용해도 어차피 Student 클래스라는 같은 클래스를 참조하기 때문에 괜찮음
        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적: " + student1.grade);
    }
}
