package model;

import interfaces.IDevice;

public class Clock implements IDevice {

    private String name;

    private String price;

    public Clock(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void connect() {
        System.out.println("Connected");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconected");
    }

    @Override
    public void showModel() {
        System.out.println(name);
        System.out.println(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
