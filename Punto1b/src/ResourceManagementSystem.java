public class ResourceManagementSystem  {
    private final HumanResources humanResources;
    private final Accounting accounting;
    private final Logistics logistics;

    public ResourceManagementSystem()  {
        humanResources = new HumanResources();
        accounting = new Accounting();
        logistics = new Logistics();
    }

    public void hireAndPayEmployee(String name, String position, int employeeId) {
        humanResources.hireEmployee(name, position);
        humanResources.processPayroll(employeeId);
    }

    public void generateAndRecordPayment(double amount, String description) {
        accounting.recordPayment(amount, description);
        accounting.generateFinancialReport();
    }

    public void manageInventoryAndOrder(String product, int quantity) {
        logistics.manageInventory(product, quantity);
        logistics.createPurchaseOrder(product, quantity);
    }
}