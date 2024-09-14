package TrabajoUnoPuntoDos;

public class DBMySqlConnection extends DBConnection{

	@Override
	public void connect(String host, String user, String password, String database) {
		// TODO Auto-generated method stub
        System.out.println("Conectando a MySQL en " + host + " con usuario " + user + " a la base de datos " + database);

	}

}
