public class Connection {
    
    private boolean idle;

    public void operation(String sql) {
        System.out.println("Running '%s'".formatted(sql));
    }

    public boolean status() {
        return this.idle;
    }

    public boolean nonAvailable() {
        return !this.idle;
    }

    public void setStatus(boolean b) {
        this.idle = b;
    }
}
