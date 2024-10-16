import java.util.ArrayList;
import java.util.List;

public class Organization extends OrganizationUnit{

    private String name;
    private List<OrganizationUnit> organizations = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public Organization(String name) {
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
        System.out.println("Organization: " + name);
        for (OrganizationUnit organization : organizations) {
            organization.showInfo();
        }
    }
}
