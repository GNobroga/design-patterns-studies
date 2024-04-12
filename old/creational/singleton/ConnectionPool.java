import java.util.List;
import java.util.stream.Stream;

public class ConnectionPool {

    private static final ConnectionPool singleton = new ConnectionPool();
    
    private static final int POOL_SIZE = 3;

    private List<Connection> connections;

    public static ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        connections = Stream.generate(() -> new Connection()).limit(POOL_SIZE).toList();
    }

    public Connection getConnection() {
        var connectionsFiltered = connections
            .stream()
            .filter(Connection::nonAvailable)
            .toList();

        if (!connectionsFiltered.isEmpty()) {
            var connection = connectionsFiltered.get(0);
            connection.setStatus(true);
            return connection;
        }
        
        throw new ConnectionAvailableException("No connection available");
    }


}
