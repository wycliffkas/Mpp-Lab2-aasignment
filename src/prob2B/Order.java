package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNum;
    private List<OrderLine> orderLines;

    public Order(String orderNum) {
        this.orderNum = orderNum;
        orderLines = new ArrayList<>();
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void addOrderLine(OrderLine orderLine) {
        orderLines.add(orderLine);
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }


}
