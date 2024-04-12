import model.Person;

public class Client {
    
    public static void main(String ...args) throws InterruptedException, CloneNotSupportedException {
        
        Person p = new Person();

       Person p1 = p.clonePerson();
       p1.right();
       p1.draw();

       Person p2 = p1.clonePerson();
       p2.right();
       p2.draw();


    }
}
