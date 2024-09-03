package exception.ex2;

public class NetworkClientV2_1 {

    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);  //생성자 호출 address를 "http://example.com"로 초기화
        client.initError(data); //data가 error1을 포함하면 connectError이 true, data가 error2를 포함하면 sendError이 true

        client.connect();   //connectError이 true이면 NetworkClientExceptionV2로 예외 객체를 던짐
        client.send(data);  //sendError가 true이면 NetworkClientExceptionV2로 예외 객체를 던짐
        client.disconnect();    // 연결해제
    }
}
