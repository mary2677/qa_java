package com.example;

import java.util.List;
// class Lion
public class Lion {

//There is a mane true\false
    boolean hasMane;
    //Класс Lion не должен зависеть от класса Feline. Использован принцип инъекции зависимостей.
    final Feline feline;


    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) { // if the male
            hasMane = true;  //that have a mane
        } else if ("Самка".equals(sex)) {  // if the female
            hasMane = false;    // that haven't a mane
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }  // incorrect input values
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
