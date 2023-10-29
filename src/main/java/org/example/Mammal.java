package org.example;

import java.util.ArrayList;
import java.util.List;

public class Mammal extends Animal{
//    private String an_sound;
//    private List<Mammal> mammals =new ArrayList<>();

    public Mammal(String an_name, String an_category, String an_sound, String an_history) {
        super(an_name, an_category, an_sound, an_history);
    }

    @Override
    public void makeSound() {
        System.out.println(getAn_sound());
    }

    @Override
    public void an_history(){
        System.out.println(getAn_history());
    }
}