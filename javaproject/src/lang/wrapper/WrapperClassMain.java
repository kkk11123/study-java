package lang.wrapper;

public class WrapperClassMain {
    public static void main(String[] args) {

        Integer integerObj = Integer.valueOf(10); //-128~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100000);
        Double doubleObj = Double.valueOf(10.5);

        System.out.println("integerObj = " + integerObj);
        System.out.println("longObj = " + longObj);
        System.out.println("doubleObj = " + doubleObj);

        System.out.println("내부 값 읽기");
        int intValue = integerObj.intValue();
        System.out.println("intValue = " + intValue);

        long longValue = longObj.longValue();
        System.out.println("longValue = " + longValue);

        double doubleValue = doubleObj.doubleValue();
        System.out.println("doubleValue = " + doubleValue);

    }
}
