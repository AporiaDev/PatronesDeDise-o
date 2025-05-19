package org.example;

public class Product implements IPrototype {

    private String name;
    private double price;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public IPrototype clone() {
        Product p = new Product(name, price);
        return p;
    }
    @Override
    public IPrototype deepClone() {

    }
}
