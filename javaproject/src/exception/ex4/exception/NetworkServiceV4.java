package exception.ex4.exception;


public class NetworkServiceV4 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        NetworkClientV4 client = new NetworkClientV4(address); //생성자 호출, address를 "https://example.com"로 초기화
        client.initError(data);

        try {
            client.connect();   //연결 시도
            client.send(data);  //전송 시도
            //NetworkServiceV4는 발생하는 예외인 ConnectExceptionV4, SendExceptionV4를 잡아도 해당 오류들을 복구할 수 없다. 따라서 예외를 밖으로 던진다.
        } finally {
            client.disconnect();
        }

    }
}
