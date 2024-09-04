package exception.ex4.exception;

public class NetworkClientExceptionV4 extends RuntimeException {//RuntimeException을 상속받기 때문에 언체크(런타임) 예외
    public NetworkClientExceptionV4(String message) {   //생성자
        super(message); //super(message)로 전달한 메시지는 Throwable에 있는 detailMessage에 보관된다., getMessage()를 통해 조회 가능
    }
}
