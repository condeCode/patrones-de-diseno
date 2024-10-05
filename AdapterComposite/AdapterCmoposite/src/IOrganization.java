public interface IOrganization {
  public void add(IOrganization organization);

  public void remove(IOrganization organization);

  public void searchUser(String userName);

  public void generateReport();

  public void showEmployees();

  public void showInfo();
}
