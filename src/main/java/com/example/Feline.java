package com.example;

import java.util.List;
//cats class - animals - predator
public class Feline extends Animal implements Predator {

    //predator eats meat
    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    //family cat
    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    //count of kittens
    public int getKittens() {
        return getKittens(1);
    }

    //have kittens
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
