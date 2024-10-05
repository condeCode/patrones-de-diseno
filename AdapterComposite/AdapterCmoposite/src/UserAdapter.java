public class UserAdapter implements INewAuthentication {

  private User user;

  public UserAdapter(User user) {
    this.user = user;
  }

  @Override
  public String getFirstName() {
    return user.getFirstName();
  }

  @Override
  public String getLastName() {
    return user.getLastName();
  }

  @Override
  public String getUserName() {
    return user.getUserName();
  }

  @Override
  public Boolean checkUsernameAndPassword(String userName, String password) {
    return user.checkUsernameAndPassword(userName, password);
  }

  @Override
  public void setFirstName(String firstName) {
    user.setFirstName(firstName);
  }

  @Override
  public void setLastName(String lastName) {
    user.setLastName(lastName);
  }

  @Override
  public void setUserName(String userName) {
    user.setUserName(userName);
  }

  @Override
  public void setPassword(String password) {
    user.setPassword(password);
  }
}
