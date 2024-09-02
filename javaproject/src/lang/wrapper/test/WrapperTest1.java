package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int intValue1 = Integer.parseInt(str1);
        int intValue2 = Integer.parseInt(str2);

        int sum = intValue1 + intValue2;
        System.out.println("sum = " + sum);
    }
}
