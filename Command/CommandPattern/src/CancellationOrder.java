public class CancellationOrder implements IOrder {
  @Override
  public void Execute() {
    System.out.println("Cancellation order executed!");
  }
}
