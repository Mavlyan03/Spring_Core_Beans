package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog implements Animal {
    @Value("${dogBreed}")
    private String dogBreed;
    @Value("${dogColor}")
    private String dogColor;
    @Value("${dogAge}")
    private int dogAge;

    public Dog() {
    }

    public Dog(String dogBreed, String dogColor, int dogAge) {
        this.dogBreed = dogBreed;
        this.dogColor = dogColor;
        this.dogAge = dogAge;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public int getDogAge() {
        return dogAge;
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }

    @Override
    public void animalPlus() {
        System.out.println("My favourite animal is a dog");
    }

    @Override
    public void animalMinus() {
        System.out.println("My unloved animal is a dog");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogBreed='" + dogBreed + '\'' +
                ", dogColor='" + dogColor + '\'' +
                ", dogAge=" + dogAge +
                '}';
    }
}
