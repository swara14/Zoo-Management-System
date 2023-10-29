package org.example;

public abstract class Animal{
    private String an_name;
    private String an_category;
    private String an_sound;
    private String an_history;

    public Animal(String an_name, String an_category, String an_sound, String an_history) {
        this.an_name = an_name;
        this.an_category = an_category;
        this.an_sound = an_sound;
        this.an_history=an_history;
    }

    public String getAn_Name() {
        return an_name;
    }

    public String getAn_Category() {
        return an_category;
    }

    public String getAn_sound() {
        return an_sound;
    }

    public void setAn_sound(String an_sound) {
        this.an_sound = an_sound;
    }

    public String getAn_history() {
        return an_history;
    }


    public abstract void makeSound();
    public abstract void an_history();

}