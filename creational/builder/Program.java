import builder.HamburguerBuilder;
import model.Hamburguer;

public class Program {
    
    public static void main(String ...args) {

        HamburguerBuilder builder = new HamburguerBuilder();

        Hamburguer burguer = builder
            .bread(true)
            .egg(true)
            .build();


        System.out.println(burguer.isBread());
    }
}
