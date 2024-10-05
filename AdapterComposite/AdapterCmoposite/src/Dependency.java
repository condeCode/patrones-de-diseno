import java.util.ArrayList;
import java.util.List;

public class Dependency implements IOrganization {
  private String name;
  private List<IOrganization> organizations = new ArrayList<>();

  public Dependency(String name) {
    this.name = name;
  }

  @Override
  public void add(IOrganization organization) {
    organizations.add(organization);
  }

  @Override
  public void remove(IOrganization organization) {
    organizations.remove(organization);
  }

  @Override
  public void searchUser(String userName) {
    for (IOrganization organization : organizations) {
      organization.searchUser(userName);
    }
  }

  @Override
  public void generateReport() {
    for (IOrganization organization : organizations) {
      organization.generateReport();
    }
  }

  @Override
  public void showEmployees() {
    for (IOrganization organization : organizations) {
      organization.showEmployees();
    }
  }

  @Override
  public void showInfo() {
    System.out.println("Dependency: " + name);
    for (IOrganization organization : organizations) {
      organization.showInfo();
    }
  }
}
