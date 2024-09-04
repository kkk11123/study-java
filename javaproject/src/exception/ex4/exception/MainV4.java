package exception.ex4.exception;



import exception.ex4.NetworkService5;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkService5 networkService = new NetworkService5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }
            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e); //error2가 입력되면 추가로 System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData()); 출력
            }
            System.out.println();

        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
    //공통 예외 처리
    private static void exceptionHandler(Exception e) {
        //공통 처리
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); //e.printStackTrace()를 사용하면 예외 메시지와 스택 트레이스 출력
        //e.printStackTrace(); //System.err에 스택 트레이스 출력, System.err로 출력하면 출력 결과를 빨간색으로 보여준다.

        //필요하면 예외 별로 별도의 추가 처리 기능
        if (e instanceof SendExceptionV4 sendEx) { //만약 e가 SendExceptionV4의 인스턴스라면
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}

