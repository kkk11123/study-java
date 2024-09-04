package exception.ex4;

public class NetworkService5 {

    public void sendMessage(String data) {
        String address = "https://example.com";

        //try with resources 구문: try괄호 안에 사용할 자원을 명시한다.
        //이 자원은 try 블럭이 끝나면 자동으로 AutoCloseable.close()를 호출해서 자원을 해제한다, catch 블럭 없어도 close()는 호출
        try (NetworkClientV5 client = new NetworkClientV5(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage()); //예외 메시지 출력
            throw e; //잡은 예외를 다시 밖으로 던짐
        }
    }
}
