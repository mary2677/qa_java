package com.example;

import java.util.List;

//feline predator class
public class Cat {
//predator
    Predator predator;

//It's a feline predator.
    public Cat(Feline feline) {
        this.predator = feline;
    }

    //makes a sound
    public String getSound() {
        return "Мяу";
    }

    //He eats meat
    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    }

}
