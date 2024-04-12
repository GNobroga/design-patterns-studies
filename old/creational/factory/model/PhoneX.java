package model;

import interfaces.IPhone;

public class PhoneX implements IPhone {
    
    private String name;

    private String brand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void update() {
        System.out.println("Atualizando IPhone X...");
    }
}
