package org.example;

public class Attraction implements interface_Att{
    private int id;
    private String at_name;
    private Double price;
    private String description;
    private boolean isOpen;
    private int count;

    public Attraction(int id, String at_name, Double price, String description) {
        this.id = id;
        this.at_name = at_name;
        this.price = price;
        this.description=description;
        this.isOpen = false;
        this.count=0;
    }
    @Override
    public int getId() {
        return id;
    }
    @Override
    public String getAt_name() {
        return at_name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount() {
        this.count = count+1;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}
