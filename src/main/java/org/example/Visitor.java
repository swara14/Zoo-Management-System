package org.example;

import java.util.ArrayList;
import java.util.List;

public class Visitor implements inter_Visitor{
    private String name;
    private int age;
    private int phone_number;
    private double balance;
    private String email;
    private String password;
    private String member_type;
    private int number_tickets;
    private String feedback;

    public Visitor(String name, String email, String password, String member_type, double balance, int age) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.member_type = member_type;
        this.number_tickets=0;
        this.feedback=getFeedback();
        this.balance=balance;
        this.age=age;
    }

    public List<String> purchasedAttractions = new ArrayList<>();

    public void addPurchaseAttractions(String name) {
        purchasedAttractions.add(name);
    }
    public boolean hasPurchasedTicket(String name) {
//        return purchasedAttractions.contains(name);
        for (String purchase : purchasedAttractions) {
            if (purchase.equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }

//    public Visitor() {
//    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getMember_type() {
        return member_type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMember_type(String member_type) {
        this.member_type = member_type;
    }

    public int getNumber_tickets() {
        return number_tickets;
    }

    public void setNumber_tickets(int number_tickets) {
        this.number_tickets = number_tickets;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}