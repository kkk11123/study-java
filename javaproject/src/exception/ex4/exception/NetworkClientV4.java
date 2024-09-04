package exception.ex4.exception;

public class NetworkClientV4 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV4(String address) {//생성자 address 초기화, 불변 객체
        this.address = address;
    }

    public void connect()  {//런타임 예외 이므로 throws ConnectExceptionV4 생략
        if(connectError) {  //initError 메서드를 통해 error1이 들어오면 생성된 ConnectExceptionV4 객체를 밖으로 던짐
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println((address + " 서버 연결 성공"));

    }

    public void send(String data) { //런타임 예외 이므로 throws ConnectExceptionV4 생략
        if(sendError) { //initError 메서드를 통해 error2가 들어오면 생성된 SendExceptionV4 객체를 밖으로 던짐
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " +data);
    }
    //연결 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")){
            connectError = true;
        }
        if (data.contains("error2")){
            sendError = true;
        }
    }
}
