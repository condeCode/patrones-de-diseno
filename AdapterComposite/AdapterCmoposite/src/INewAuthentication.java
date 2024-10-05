public interface INewAuthentication {
  public String getFirstName();

  public String getLastName();

  public String getUserName();

  public Boolean checkUsernameAndPassword(String userName, String password);

  public void setFirstName(String firstName);

  public void setLastName(String lastName);

  public void setUserName(String userName);

  public void setPassword(String password);
}
