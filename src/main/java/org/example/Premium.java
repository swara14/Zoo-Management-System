package org.example;

public class Premium extends Visitor{
    public Premium(String name, String email, String password, String member_type, double balance, int age) {
        super(name, email, password, "Premium", balance, age);
    }
}
