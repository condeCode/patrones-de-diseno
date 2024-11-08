public class App {
    public static void main(String[] args) throws Exception {
        OrderProcessor orderProcessor = new OrderProcessor();

        IOrder saleOrder = new SaleOrder();
        IOrder returnOrder = new ReturnOrder();
        IOrder refundOrder = new RefundOrder();
        IOrder cancellationOrder = new CancellationOrder();

        orderProcessor.AddOrder(saleOrder);
        orderProcessor.AddOrder(returnOrder);
        orderProcessor.AddOrder(refundOrder);
        orderProcessor.AddOrder(cancellationOrder);

        orderProcessor.ProcessOrders();
    }
}