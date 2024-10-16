public class App {
  public static void main(String[] args) throws Exception {
    User user = new User("John", "Doe", "johndoe", "password123");

    UserAdapter userAdapter = new UserAdapter(user);

    AuthenticationService authenticationService = new AuthenticationService(userAdapter);

    if (authenticationService.Authenticate("johndoe", "password123")) {
      Organization organization1 = new Organization("Org");
      Headquarter headquarter = new Headquarter("HQ");
      Dependency dependency1 = new Dependency("dep1");
      Dependency dependency2 = new Dependency("dep2");

      organization1.add(headquarter);
      headquarter.add(dependency1);
      dependency1.add(dependency2);
      headquarter.add(new Dependency("dep3"));
      dependency1.add(new Dependency("dep4"));

      organization1.showInfo();

      headquarter.addEmployee(new Employee("Emp1"));
      headquarter.addEmployee(new Employee("Emp2"));

      organization1.showEmployees();
    } else {
      System.out.println("Not Authenticated");
    }
  }
}
