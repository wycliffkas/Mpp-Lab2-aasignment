package prob2B;

public class OrderLine {
    private Order order;

    public OrderLine(Order order) {
         this.order = order;
         order.addOrderLine(this);
    }

    public Order getOrder() {
        return order;
    }
}
