package org.example;

public class Discount {
    String category;
    int discount;
    String description;
    String code;


    public Discount(String category, int discount) {
        this.category = category;
        this.discount = discount;
        this.code=null;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String category, int discount) {
        this.code = category.toUpperCase()+discount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
