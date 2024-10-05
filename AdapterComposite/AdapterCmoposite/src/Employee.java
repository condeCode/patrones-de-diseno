public class Employee implements IOrganization {
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  @Override
  public void add(IOrganization organization) {
    // Do nothing because this is a leaf node
  }

  @Override
  public void remove(IOrganization organization) {
    // Do nothing because this is a leaf node
  }

  @Override
  public void searchUser(String userName) {
    // Do nothing because this is a leaf node
  }

  @Override
  public void generateReport() {
    // Do nothing because this is a leaf node
  }

  @Override
  public void showEmployees() {
    // Do nothing because this is a leaf node
  }

  @Override
  public void showInfo() {
    System.out.println("Employee: " + name);
  }
}
