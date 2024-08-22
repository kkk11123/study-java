package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int row =0; row < arr.length; row++) {
            System.out.println((row+1) + "번 학생의 성적을 입력하세요: ");
            for (int col =0; col < arr[row].length; col++) {
                System.out.print(subjects[col] + " 점수: ");
                arr[row][col] = scanner.nextInt();
                scanner.nextLine();

            }
        }


        for (int row =0; row < arr.length; row++) {
            int sum = 0;
            for (int col =0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            double average = (double)sum / arr.length;
            System.out.println((row+1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }

    }

}
