package lang.wrapper;

public class WrapperUtilsMain {

    public static void main(String[] args) {

        Integer i1 = Integer.valueOf(10); //숫자, 래퍼 객체 반환
        Integer i2 = Integer.valueOf("20");// 문자열, 래퍼 객체 반환
        int intValue = Integer.parseInt("10");//문자열 전용, 기본형 반환

        //비교
        int compareResult = i1.compareTo(20);
        System.out.println("compareResult = " + compareResult);

        //산술 연산
        System.out.println("sum: " + Integer.sum(i1, i2));
        System.out.println("sum: " + Integer.min(i1, i2));
        System.out.println("sum: " + Integer.max(i1, i2));

    }
}
