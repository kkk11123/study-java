package exception.ex2;

public class NetworkClientExceptionV2 extends Exception{ //Exception을 상속받기 때문에 체크 예외

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); //super(message)로 전달한 메시지는 Throwable에 있는 detailMessage에 보관된다., getMessage()를 통해 조회 가능
        this.errorCode = errorCode;     //어떤 종류의 오류가 발생했는지 구분하기 위해 예외 안에 오류 코드를 보관
    }

    public String getErrorCode() {
        return errorCode;
    }
}
