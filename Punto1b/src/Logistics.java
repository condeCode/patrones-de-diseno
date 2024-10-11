class Logistics {
    public void manageInventory(String product, int quantity) {
        System.out.println("Updating inventory: " + product + " quantity " + quantity);
    }

    public void createPurchaseOrder(String product, int quantity) {
        System.out.println("Creating purchase order for " + product + " quantity " + quantity);
    }
}