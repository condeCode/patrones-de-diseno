public class Employee implements IOrganization {
  private String name;

  public Employee(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public void showInfo() {
    System.out.println("Employee: " + name);
  }
}
