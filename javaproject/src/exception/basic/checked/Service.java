package exception.basic.checked;

// Checked 예외는 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드

    public void callCatch() {
        try{
            client.call();
        }
        catch(MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, e.getMessage() = " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    //체크 예외를 밖으로 던지는 코드
    public void callThrow() throws Exception{
        client.call();
    }
}
