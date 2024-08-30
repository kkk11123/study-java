package array.ex;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] sub = new String[3];
        for (int num1 = 0; num1 <3; num1++) {
            System.out.print("과목을 입력하세요: ");
            sub[num1] = scanner.nextLine();
        }
        System.out.print("학생 수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        //str = {국어, 영어, 수학}
        int[][] scores = new int [studentCount][sub.length];
        for (int i = 0; i<studentCount; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < sub.length; j++) {
                System.out.print(sub[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }
        int successGrade = 60;
        double[] grades = new double[studentCount];

        for(int i = 0; i<studentCount; i++) {
            int sum = 0;
            for (int j = 0; j < sub.length; j++) {
                sum = sum + scores[i][j];
            }
            double avg = (double) sum / (double) sub.length;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + " 평균: " + avg);
            grades[i] = avg;
        }
        for(int i = 0; i<studentCount; i++) {
            if(grades[i] > successGrade) {
                System.out.println((i+1) + "번 학생 합격!");
            }
            else{
                System.out.println((i+1 + "번 학생 불합격!"));
            }
        }
    }
}
