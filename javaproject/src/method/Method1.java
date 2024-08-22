package method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(5,10);
        printString(sum1);
        int sum2 = add(15,20);
        printString(sum2);
    }

    public static int add(int a, int b) {
        System.out.println(a + "+" + b + "연산 수행");
        int sum = a+b;
        return sum;
    }

    public static void printString(int num1){
        System.out.println("결과 출력: " + num1);
    }
}
