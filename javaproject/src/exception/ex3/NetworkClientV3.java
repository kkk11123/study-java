package exception.ex3;

public class NetworkClientV3 {

    private final String address;
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV3(String address) {//생성자 address 초기화, 불변 객체
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3{//예외 발생시 NetworkClientExceptionV2 클래스로 예외를 던짐
        if(connectError) {  //initError 메서드를 통해 error1이 들어오면 ConnectExceptionV3를 밖으로 던짐
            throw new ConnectExceptionV3(address, address + " 서버 연결 실패");
        }
        //연결 성공
        System.out.println((address + " 서버 연결 성공"));

    }

    public void send(String data) throws SendExceptionV3 {//예외 발생시 NetworkClientExceptionV2 클래스로 예외를 던짐
        if(sendError) { //initError 메서드를 통해 error2가 들어오면 SendExceptionV3를 밖으로 던짐
            throw new SendExceptionV3(data, address + " 서버에 데이터 전송 실패: " + data);
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
