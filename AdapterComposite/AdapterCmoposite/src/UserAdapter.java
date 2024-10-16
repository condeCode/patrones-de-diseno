public class UserAdapter {

  private User user;

  public UserAdapter(User user) {
    this.user = user;
  }

  public String getFirstName() {
    return user.getFirstName();
  }

  public String getLastName() {
    return user.getLastName();
  }

  public String getUserName() {
    return user.getUserName();
  }

  public Boolean checkUsernameAndPassword(String userName, String password) {
    return user.checkUsernameAndPassword(userName, password);
  }

  public void setFirstName(String firstName) {
    user.setFirstName(firstName);
  }

  public void setLastName(String lastName) {
    user.setLastName(lastName);
  }

  public void setUserName(String userName) {
    user.setUserName(userName);
  }

  public void setPassword(String password) {
    user.setPassword(password);
  }
}
