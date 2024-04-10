public class Client {
    
    public void createUser(String name, Integer age) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        var conn = connectionPool.getConnection();
        conn.operation("INSERT INTO user (name, age) VALUES (%s, %d)".formatted(name, age));
    }

    public void deleteUser(Long id) {
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        var conn = connectionPool.getConnection();
        conn.operation("DELETE users u WHERE u.id = %d".formatted(id));
    }
}
