package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rabbit implements Animal {
    @Value("${nickName}")
    private String nickName;
    @Value("${color}")
    private String color;
    @Value("${weight}")
    private int weight;

    public Rabbit() {
    }

    public Rabbit(String nickName, String color, int weight) {
        this.nickName = nickName;
        this.color = color;
        this.weight = weight;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    @Override
    public void animalPlus() {
        System.out.println("My favourite animal is a rabbit");
    }

    @Override
    public void animalMinus() {
        System.out.println("My unloved animal is a rabbit");
    }
    @Override
    public String toString() {
        return "Rabbit{" +
                "nickName='" + nickName + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
