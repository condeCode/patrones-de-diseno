public class RefundOrder implements IOrder {
  @Override
  public void Execute() {
    System.out.println("Refund order executed!");
  }
}