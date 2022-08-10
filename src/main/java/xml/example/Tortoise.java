package xml.example;

import org.example.Person;

public class Tortoise implements Animal {
    private String nickName;
    private String type;
    private int age;
    private Human human;

    public Tortoise() {
    }

    public Tortoise(String nickName, String type, int age) {
        this.nickName = nickName;
        this.type = type;
        this.age = age;
    }

    public Tortoise(Human human) {
        this.human = human;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    @Override
    public String toString() {
        return "Tortoise{" +
                "nickName='" + nickName + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void animalMinus() {
        System.out.println("My unloved animal is a tortoise");
    }

    @Override
    public void animalPlus() {
        System.out.println("My favourite animal is a tortoise");
    }
}
