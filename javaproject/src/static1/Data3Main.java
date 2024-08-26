package static1;

public class Data3Main {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " +Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " +Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " +Data3.count);

        Data3.count++;
        System.out.println("D count = " +Data3.count);
    }
}
