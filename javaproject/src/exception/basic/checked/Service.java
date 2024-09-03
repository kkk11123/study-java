package exception.basic.checked;

// Checked 예외는 예외를 잡아서 처리하거나, 던지거나 둘중 하나를 필수로 선택해야 한다.
public class Service {
    Client client = new Client();

    // 예외를 잡아서 처리하는 코드

    public void callCatch() {
        try{
            client.call();  //3. Client에서 던진 예외를 여기서 캐치, throw new MyCheckedException("ex"); 가 여기로 옴
        }
        catch(MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, e.getMessage() = " + e.getMessage()); //예외가 들어오면 실행
        }
        System.out.println("정상 흐름");    //예외처리 후 정상 흐름일때 실행, 예외 처리 실패해서 메서드 밖으로 던지는게 아니라 처리 후 정상적으로 실행
    }

    //체크 예외를 밖으로 던지는 코드, 여기서도 해결 못할 때 또 밖으로 던짐
    public void callThrow() throws Exception{
        client.call();
    }
}
