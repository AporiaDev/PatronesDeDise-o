package org.example;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class PriceList implements IPrototype{

    private String name;
    private List<Product> productList = new ArrayList<>();

    public PriceList(String name) {
        this.name = name;
    }


    @Override
    public IPrototype clone() {
        PriceList priceList = new PriceList(name);
        clone.setProductList(productList);
        return clone;
    }
    @Override
    public IPrototype deepClone() {
        return null;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
