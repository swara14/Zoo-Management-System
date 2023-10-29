package org.example;

public class Basic extends Visitor{
    private int num_tickets;

    public Basic(String name, String email, String password, String member_type, double balance, int num_tickets, int age) {
        super(name, email, password, "Basic", balance, age);
        this.num_tickets = num_tickets;
    }

    public int getNum_tickets() {
        return num_tickets;
    }
    public void setNum_tickets(int num_tickets) {
        this.num_tickets = num_tickets;
    }
}