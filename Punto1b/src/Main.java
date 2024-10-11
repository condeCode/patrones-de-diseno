public class Main {
    public static void main(String[] args) {
        ResourceManagementSystem resourceSystem = new ResourceManagementSystem();
        Company company = new Company(resourceSystem);
        company.requestResource().hireAndPayEmployee("Michael Jordan", "Developer", 12345);
        company.requestResource().generateAndRecordPayment(1500.0, "Payment for services");
        company.requestResource().manageInventoryAndOrder("Laptop", 10);
    }
}