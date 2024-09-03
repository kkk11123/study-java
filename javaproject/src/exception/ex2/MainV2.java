package exception.ex2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientExceptionV2 {
        Scanner scanner = new Scanner(System.in);
        NetworkClientV2_1 networkService = new NetworkClientV2_1();
        while(true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();

            if(input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);  //입력 받은 문자가 error1 일때, client.connect() 실행, error2일때, client.send(data) 실행
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
}
