package exception.ex4.exception;


//전송 실패시 발생하는 예외
public class SendExceptionV4 extends NetworkClientExceptionV4 {
    //계층 구조 : RuntimeException -> NetworkClientExceptionV4 -> SendExceptionV4

    private final String sendData;

    public SendExceptionV4(String message, String sendData) {
        super(message); //super(message)로 전달한 메시지는 Throwable에 있는 detailMessage에 보관된다., getMessage()를 통해 조회 가능
        this.sendData = sendData; //예외 내부에 전송을 시도한 데이터인 sendData를 보관
    }

    public String getSendData() {
        return sendData;
    }
}
