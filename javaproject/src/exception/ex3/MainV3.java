package exception.ex3;

import java.util.Scanner;

public class MainV3 {

    public static void main(String[] args) {
        NetworkServiceV3_1 networkService = new NetworkServiceV3_1();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if(input.equals("exit")) {
                break;
            }

            networkService.sendMessage(input); //입력 받은 문자가 error1 일때, client.connect() 실행, error2일때, client.send(data) 실행
            System.out.println();

        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
