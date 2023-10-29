package org.example;

public class SpecialDeal {
    int minAttractions;
    int discount;
    String code;

    public SpecialDeal(int minAttractions, int discount) {
        this.minAttractions = minAttractions;
        this.discount = discount;
        this.code = null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(int discount) {
        this.code = "DEALS"+discount;
    }

    public int getMinAttractions() {
        return minAttractions;
    }

    public int getDiscount() {
        return discount;
    }
}
