package exception.ex3;

public class NetworkServiceV3_1 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV3 client = new NetworkClientV3(address); //생성자 호출, address를 "https://example.com"로 초기화
        client.initError(data);

        try{
            client.connect();   //연결 시도
            client.send(data);  //전송 시도
        } catch (ConnectExceptionV3 e) {    //연결 오류 발생시 throw new ConnectExceptionV3(address, address + " 서버 연결 실패");를 여기서 잡아서 예외 처리
            System.out.println("[연결 오류] 주소: " + e.getAddress() + ". 메시지: " + e.getMessage());
        } catch (NetworkClientExceptionV3 e) {   //NetworkClientExceptionV3는 SendExceptionV3의 부모라서 NetworkClientExceptionV3 예외를 잡으면 SendExceptionV3도 잡을 수 있다.
            System.out.println("[네트워크 오류] 메시지: " +e.getMessage()); //부모인 NetworkClientExceptionV3 예외 클래스와 공통된 기능을 써야한다. e.getSendData 실행시 오류
        } catch (Exception e) { //그 외의 예외나 RuntimeException이 발생하면 Exception이 부모이기 때문에 여기서 잡는다.
            System.out.println("[알 수 없는 오류] 메시지: " +e.getMessage());
        } finally { //반드시 실행해야되는 문장, try~catch 안에서 처리할 수 없는 RuntimeException이 발생해도 finally는 반드시 호출된다.
            client.disconnect();
        }

    }
}
