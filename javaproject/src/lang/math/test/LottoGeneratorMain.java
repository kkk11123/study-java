package lang.math.test;

public class LottoGeneratorMain {
    public static void main(String[] args) {

        LottoGenerator generator = new LottoGenerator();
        int[] numbers = generator.generrate();

        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
