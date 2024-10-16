public class Employee implements IOrganization {
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  @Override
  public void showInfo() {
    System.out.println("Employee: " + name);
  }
}
