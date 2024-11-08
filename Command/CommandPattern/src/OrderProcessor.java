import java.util.ArrayList;
import java.util.List;

public class OrderProcessor {
  private List<IOrder> orders = new ArrayList<>();

  public void AddOrder(IOrder order) {
    orders.add(order);
  }

  public void ProcessOrders() {
    for (IOrder order : orders) {
      order.Execute();
    }
    orders.clear();
  }
}