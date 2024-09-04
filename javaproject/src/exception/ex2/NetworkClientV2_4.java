package exception.ex2;

public class NetworkClientV2_4 {

    public void sendMessage(String data) throws NetworkClientExceptionV2{
        String address = "http://example.com";

        NetworkClientV2 client = new NetworkClientV2(address);  //생성자 호출 address를 "http://example.com"로 초기화
        client.initError(data); //data가 error1을 포함하면 connectError이 true, data가 error2를 포함하면 sendError이 true

        try {
            client.connect();   //연결 시도, NetworkClientV2에서 던진 예외 객체를 여기서 받음
            client.send(data);
        }catch (NetworkClientExceptionV2 e){    //throw new NetworkClientExceptionV2("connectError", address + "서버 연결 실패");
            System.out.println("[오류] 코드: " +e.getErrorCode() + ", 메시지: " +e.getMessage());  //예외 처리
        }
        finally{
            //반드시 실행해야되는 문장, try~catch 안에서 처리할 수 없는 RuntimeException이 발생해도 finally는 반드시 호출된다.
            client.disconnect();
        }

    }
}
