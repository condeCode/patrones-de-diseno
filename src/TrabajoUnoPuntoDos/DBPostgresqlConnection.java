package TrabajoUnoPuntoDos;

public class DBPostgresqlConnection implements DBConnection{

	@Override
	public void connect(String host, String user, String password, String database) {
		// TODO Auto-generated method stub
        System.out.println("Conectando a Postgresql en " + host + " con usuario " + user + " a la base de datos " + database);

	}

}
