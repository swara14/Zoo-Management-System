package org.example;

import java.util.ArrayList;
import java.util.List;

public class Admin{
    public List<Animal> animals=new ArrayList<>();
    public List<Attraction> attractions = new ArrayList<>();
    public List<Visitor> visitors=new ArrayList<>();
    public List<String> feedbacks=new ArrayList<>();
    public List<Discount> discounts=new ArrayList<>();
    public List<SpecialDeal> deals =new ArrayList<>();
    public List<visitedAttractions> visitedAttractions=new ArrayList<>();
    public List<String> mammals =new ArrayList<>();
    public List<String> reptiles =new ArrayList<>();
    public List<String> amphibians =new ArrayList<>();



    //    Basic basic_mem=new Basic();
    private boolean isOpen=true;

    public void addAnimal(Animal animal){
        animals.add(animal);
    }
    public void addAttractions(Attraction attraction){
        attractions.add(attraction);
    }
    public void addVisitors(Visitor vistor){
        visitors.add(vistor);
    }
    public void addDiscount(Discount discount){
        discounts.add(discount);
    }

    public void addDeals(SpecialDeal deal){
        deals.add(deal);
    }
    public void addVisitedAttr(visitedAttractions visitedAttr){
        visitedAttractions.add(visitedAttr);
    }

    public void removeAnimal(String name) {
        for (int i = animals.size()-1; i>=0; i--) {
            Animal animal = animals.get(i);
            if (animal.getAn_Name().equalsIgnoreCase(name)) {
                animals.remove(i);
            }
        }
    }

    public void removeAttractions(String name) {
        for (int i = attractions.size()-1; i>= 0; i--) {
            Attraction attraction = attractions.get(i);
            if (attraction.getAt_name().equalsIgnoreCase(name)) {
                attractions.remove(i);
            }
        }
    }

    public void removeDiscount(String code) {
        for (int i = discounts.size()-1; i>= 0; i--) {
            Discount discount = discounts.get(i);
            if (discount.getCode().equalsIgnoreCase(code)) {
                discounts.remove(i);
            }
        }
    }

    public void removeDeals(String code) {
        for (int i = deals.size()-1; i>=0; i--) {
            SpecialDeal deal = deals.get(i);
            if (deal.getCode().equalsIgnoreCase(code)) {
                deals.remove(i);
            }
        }
    }

    public List<Animal> ListAnimals(){
        return animals;
    }
    public List<Attraction> ListAttractions(){
        return attractions;
    }
    public List<Visitor> ListVisitors() { return visitors; }
    public List<Discount> ListDiscounts() { return discounts; }

    public void updateAnimal(String name, String sound){
        for (Animal animal : animals) {
            if (animal.getAn_Name().equalsIgnoreCase(name)) {
                animal.setAn_sound(sound);
                return;
            }
        }
    }

    public void updateAttractions(String name, String description, Double price){
        for (Attraction attraction: attractions) {
            if (attraction.getAt_name().equalsIgnoreCase(name)) {
                attraction.setPrice(price);
                attraction.setDescription(description);
                return;
            }
        }
    }
    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
