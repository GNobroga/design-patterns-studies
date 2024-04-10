public class Client {
    
    private IConnectionPool connectionPool;

    public Client(IConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }

    public void createUser(String name, Integer age) {
        var conn = connectionPool.getConnection();
        conn.operation("INSERT INTO user (name, age) VALUES (%s, %d)".formatted(name, age));
    }

    public void deleteUser(Long id) {
        var conn = connectionPool.getConnection();
        conn.operation("DELETE users u WHERE u.id = %d".formatted(id));
    }
}
