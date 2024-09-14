package TrabajoUnoPuntoDos;

public class DBPostgresqlConnection extends DBConnection{

	@Override
	public void connect(String host, String user, String password, String database) {
		// TODO Auto-generated method stub
        System.out.println("Conectando a PostgreSQL en " + host + " con usuario " + user + " a la base de datos " + database);

	}

}
