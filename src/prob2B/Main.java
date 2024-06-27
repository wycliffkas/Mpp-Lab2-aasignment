package prob2B;

public class Main {
    public static void main(String[] args) {
        Order order = new Order("xy123");
        OrderLine OrderLine = new OrderLine(order);
        OrderLine OrderLine2 = new OrderLine(order);

        for(OrderLine ol : order.getOrderLines()) {
            System.out.println("OrderLine: " + ol.getOrder().getOrderNum());
        }


    }
}
