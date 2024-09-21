package PointTwo;

public class DBConnectionFactoryMethod {
	
	public static DBConnection getConnection(String dbType) {
		
        switch (dbType.toLowerCase()) {
	        case "mysql":
	            return new DBMySqlConnection();
	        case "postgresql":
	            return new DBPostgresqlConnection();
	        case "sqlserver":
	            return new DBSqlConnection();
	        default:
	            throw new IllegalArgumentException("Tipo de base de datos no soportado: " + dbType);
        }
	}

}
