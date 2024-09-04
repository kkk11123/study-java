package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

public class NetworkClientV5 implements AutoCloseable{

    private final String address;
    private boolean connectError;
    private boolean sendError;

    public NetworkClientV5(String address) {    //생성자, address 초기화
        this.address = address;
    }

    public void connect(){ //RuntimeException이라 extends 생략
        if(connectError) {  //initError 메서드를 통해 "error1"이 들어오면 ConnectExceptionV4 예외 객체를 생성해서 밖으로 던짐
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String data) {
        if(sendError) {
            throw new SendExceptionV4(data, address + "서버에 데이터 전송 실패: " + data);    //error2가 들어오면 SendExceptionV4 예외 객체를 생성해서 밖으로 던짐
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }
    //연결 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {  //contatins: String 메서드, data가 error1을 포함하면
            connectError = true;
        }
        if (data.contains("error2")) {  //data가 error2를 포함하면
            sendError = true;
        }
    }
    @Override   //Autocloseable 클래스의 close() 함수 오버라이딩, 종료 시점에 자원을 반납하는 방법을 여기에 정의
    public void close() {
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}
