public class Program {
    public static void main(String ...args) {
        Client client = new Client(new HikariConnectionPool());

        client.createUser("Gabriel", 20);
        client.createUser("Gabriel", 20);
        client.deleteUser(1L);
    }
}
