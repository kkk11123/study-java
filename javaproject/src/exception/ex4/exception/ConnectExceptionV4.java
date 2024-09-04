package exception.ex4.exception;


//연결 실패시 발생하는 예외
public class ConnectExceptionV4 extends NetworkClientExceptionV4 {
    //계층 구조 : RuntimeException -> NetworkClientExceptionV4 -> ConnectExceptionV4

    private final String address;

    public ConnectExceptionV4(String message, String address) {
        super(message); //super(message)로 전달한 메시지는 Throwable에 있는 detailMessage에 보관된다., getMessage()를 통해 조회 가능
        this.address = address; //예외 안에 연결을 시도한 address를 보관
    }

    public String getAddress() {
        return address;
    }
}
