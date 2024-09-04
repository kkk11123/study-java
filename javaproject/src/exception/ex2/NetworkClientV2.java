package exception.ex2;

public class NetworkClientV2 {

    private final String address;   //외부에서 변경하면 안되기때문에 private final로 선언
    public boolean connectError;
    public boolean sendError;

    public NetworkClientV2(String address) { //생성자를 통해 address 초기화
        this.address = address;
    }

    public void connect() throws NetworkClientExceptionV2 { //예외 발생시 NetworkClientExceptionV2 클래스로 예외를 던짐
        if(connectError) { //에러가 발생하면
            throw new NetworkClientExceptionV2("connectError", address + "서버 연결 실패"); // 오류가 발생하면, 예외 객체를 만들고 에러 메세지를 담아둔다. 만든 객체를 throw를 통해 던짐
            //throw: 예외를 던지는 키워드, 이 시점에서 메서드 실행이 중단되고 예외가 발생
        }
        //연결 성공
        System.out.println(address + " 서버 연결 성공");// 예외 발생 안하면 실행
    }

    public void send(String data) throws NetworkClientExceptionV2 {
        if(sendError) {
            throw new NetworkClientExceptionV2("sendError", address + "서버에 데이터 전송 실패: " +data);// 오류가 발생하면, 예외 객체를 만들고 거기에 오류 코드와 오류 메시지를 담아둔다. 만든 객체를 thorw를 통해 던짐
            //throw new RuntimeException("ex");   //런타임 예외 객체 생성해서 던짐
            //이렇게 하면 catch에서 error1인 NetworkClientExceptionV2는 잡을 수 있지만 새로 등장한 error2인 RuntimeException은 잡을 수 없다.
        }
        //전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    //연결 해제
    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if(data.contains("error1")){    //contains는 String 클래스의 메서드 : error1을 포함하면 connectError = true
            connectError = true;
        }
        if(data.contains("error2")){    //error2를 포함하면 sendError = true
            sendError = true;
        }
    }
}
