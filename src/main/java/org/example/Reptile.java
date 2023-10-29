package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reptile extends Animal{

//    private List<Reptile> reptiles =new ArrayList<>();
//    private String an_sound;

    public Reptile(String an_name, String an_category, String an_sound, String an_history) {
        super(an_name, an_category, an_sound, an_history);
    }

//    public String getAn_sound() {
//        return an_sound;
//    }

    @Override
    public void makeSound() {
        System.out.println(getAn_sound());
    }
    @Override
    public void an_history(){
        System.out.println(getAn_history());
    }
}