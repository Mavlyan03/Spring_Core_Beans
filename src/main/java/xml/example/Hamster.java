package xml.example;

import org.example.Person;

public class Hamster implements Animal {
    private String name;
    private String color;
    private int weight;

   private Human human;

    public Hamster() {
    }

    public Hamster(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public Hamster(Human human) {
        this.human = human;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Hamster{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public void animalMinus() {
        System.out.println("My unloved animal is a hamster");
    }

    @Override
    public void animalPlus() {
        System.out.println("My favourite animal is a hamster");
    }
}
