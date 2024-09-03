package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException {  //2. 발생시킨 예외를 메서드 밖으로 던짐
        //문제 상황
        throw new MyCheckedException("ex"); //1. 예외를 발생시키고
    }
}
