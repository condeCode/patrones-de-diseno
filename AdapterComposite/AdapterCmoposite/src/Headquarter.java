import java.util.ArrayList;
import java.util.List;

public class Headquarter extends OrganizationUnit {
  private String name;
  private List<OrganizationUnit> organizations = new ArrayList<>();
  private List<Employee> employees = new ArrayList<>();

  public Headquarter(String name) {
    this.name = name;
  }

  @Override
  public void add(OrganizationUnit organization) {
    organizations.add(organization);
  }

  @Override
  public void remove(OrganizationUnit organization) {
    organizations.remove(organization);
  }

  public boolean employeeExists(Employee employee) {
    for (Employee emp : employees) {
      if (emp.getName().equals(employee.getName())) {
        return true;
      }
    }

    for (OrganizationUnit organization : organizations) {
      if (organization instanceof Headquarter) {
        Headquarter headquarter = (Headquarter) organization;
        if (headquarter.employeeExists(employee)) {
          return true;
        }
      } else if (organization instanceof Dependency) {
        Dependency dependency = (Dependency) organization;
        if (dependency.employeeExists(employee)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public void addEmployee(Employee employee) {
    if (!employeeExists(employee)) {
      employees.add(employee);
    } else {
      System.out.println("Error: Employee " + employee.getName() + " already exists in a headquarters or dependency.");
    }
  }

  @Override
  public void searchUser(String userName) {

    for (OrganizationUnit organization : organizations) {
      organization.searchUser(userName);
    }

  }

  @Override
  public void generateReport() {
    for (OrganizationUnit organization : organizations) {
      organization.generateReport();
    }
  }

  @Override
  public void showEmployees() {

    employees.forEach(Employee::showInfo);
    for (OrganizationUnit organization : organizations) {
      organization.showEmployees();
    }
  }

  @Override
  public void showInfo() {
    System.out.println("Headquarter: " + name);
    for (OrganizationUnit organization : organizations) {
      organization.showInfo();
    }
  }
}
