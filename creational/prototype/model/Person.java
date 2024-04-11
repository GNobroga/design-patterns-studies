package model;

public class Person implements Cloneable {

    private String head;

    private String body;

    private String legs;

    private String floor;

    public Person() {
        this.head = "    O";
        this.body = "   /|\\";
        this.legs = "   /_\\";
        this.floor = "_________";
    }


    public void draw() {
        System.out.println(this.head);
        System.out.println(this.body);
        System.out.println(this.legs);
        System.out.println(this.floor);
    }

    public void right() {
        this.head = "  " + this.head;
        this.body = "  " + this.body;
        this.legs = "  " + this.legs;
        this.floor = "__" + this.floor;
    }

    public void left() {
        this.head = this.head.substring(2);
        this.body = this.body.substring(2);
        this.legs = this.legs.substring(2);
        this.floor = this.floor.substring(2);
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Person clonePerson() throws CloneNotSupportedException {
        return (Person) this.clone();
    }

}