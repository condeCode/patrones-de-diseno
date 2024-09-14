package TrabajoUnoPuntoDos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbType = "mysql";
        DBConnection connection = DBConnectionFactoryMethod.getConnection(dbType);
        
        connection.connect("localhost", "user", "password", "my_database");
		
		/**
        String query = new QueryBuilder()
                .select("id", "name", "age")
                .from("users")
                .where("age > 18")
                .orderBy("name", "ASC")
                .build();
		 * 
		 */
        /**
        String query = new QueryBuilder()
                .select("")
                .from("users")
                .where("age > 18")
                .orderBy("name", "ASC")
                .build();
         * 
         */
		
        String query = new QueryBuilder()
                .select("id, name, age, email, ")
                .from("users")
                .where("age > 18")
                .groupBy("users")
                .having("")
                .orderBy("name", "ASC")
                .build();


        System.out.println("Consulta generada: " + query);
        

        System.out.println("Ejecutando la consulta en " + dbType + ": " + query);
	}

}
