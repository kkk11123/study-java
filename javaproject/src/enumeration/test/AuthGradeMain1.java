package enumeration.test;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        AuthGrade[] authGrades = AuthGrade.values();
        for (AuthGrade authGrade : authGrades) {
            print(authGrade);
        }
    }

    public static void print(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade.getAuth() + ", level = " + authGrade.getLevel() + ", 설명 = " +authGrade.getDescription());

    }
}
