package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 1500, 3);
        productOrders[1] = createOrder("김치", 3000, 3);
        productOrders[2] = createOrder("상어", 13000, 2);

        for(int i =0; i<productOrders.length; i++) {
            print(productOrders[i]);
        }
        getTotalPrice(productOrders);


    }

    private static void print(ProductOrder order) {
        System.out.println("상품명: " + order.productName + " 가격: " + order.price + " 수량: " + order.quantity);
    }

    private static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
    private static void getTotalPrice(ProductOrder[] productOrders) {
        int sum = 0;
        for (ProductOrder productOrder : productOrders) {
            sum += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " +sum);
    }
}
