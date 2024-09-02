package enumeration.ex0;

public class DiscountService {
    public int discount(String grade, int price) {
        int dicountPercent = 0;

        if(grade.equals("BASIC")) {
            dicountPercent = 10;
        }
        else if(grade.equals("GOLD")) {
            dicountPercent = 20;
        }
        else if(grade.equals("DIAMOND")) {
            dicountPercent = 30;
        }
        else {
            System.out.println(grade + ": 할인X");
        }
        return price * dicountPercent / 100;
    }

}
