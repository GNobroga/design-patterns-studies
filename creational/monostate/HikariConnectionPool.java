import java.util.List;
import java.util.stream.Stream;

public class HikariConnectionPool implements IConnectionPool {

    private static final int POOL_SIZE = 3;

    private static List<Connection> connections;

    static {
        connections = Stream.generate(() -> new Connection()).limit(POOL_SIZE).toList();
    }

    public HikariConnectionPool() {}

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
