package TrabajoUnoPuntoDos;

public class QueryBuilder {

	private StringBuilder selectFields = new StringBuilder();
    private String table;
    private StringBuilder conditions = new StringBuilder();
    private StringBuilder orderBy = new StringBuilder();
    private StringBuilder groupBy = new StringBuilder();
    private StringBuilder having = new StringBuilder();


    public QueryBuilder select(String... fields) {
        if (selectFields.length() > 0) {
            selectFields.append(", ");
        } 
        selectFields.append(String.join(", ", fields));
        return this;
    }


    public QueryBuilder from(String table) {
        this.table = table;
        return this; 
    }


    public QueryBuilder where(String condition) {
        if (conditions.length() > 0) {
            conditions.append(" AND ");
        }
        conditions.append(condition);
        return this; 
    }


    public QueryBuilder orderBy(String field, String order) {
        if (orderBy.length() > 0) {
            orderBy.append(", ");
        }
        orderBy.append(field).append(" ").append(order);
        return this; 
    }


    public QueryBuilder groupBy(String... fields) {
        if (groupBy.length() > 0) {
            groupBy.append(", ");
        }
        groupBy.append(String.join(", ", fields));
        return this;
    }
    
    public QueryBuilder having(String... fields) {
        if (groupBy.length() > 0) {
            groupBy.append(" ");
        }
        groupBy.append(String.join(", ", fields));
        return this;
    }


    public String build() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT ").append(selectFields.length() > 0 ? selectFields : "*");
        query.append(" FROM ").append(table);
        if (conditions.length() > 0) {
            query.append(" WHERE ").append(conditions);
        }
        if (groupBy.length() > 0) {
            query.append(" GROUP BY ").append(groupBy);
        }
        if (having.length() > 0) {
            query.append(" HAVING ").append(having);
        }
        if (orderBy.length() > 0) {
            query.append(" ORDER BY ").append(orderBy);
        }
        return query.toString();
    }
}
