public class AuthenticationService {

    private UserAdapter userAdapter;


    public AuthenticationService(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }

    public Boolean Authenticate(String username, String password){

        return userAdapter.checkUsernameAndPassword(username, password);

    }



    public UserAdapter getUserAdapter() {
        return userAdapter;
    }

    public void setUserAdapter(UserAdapter userAdapter) {
        this.userAdapter = userAdapter;
    }
}
