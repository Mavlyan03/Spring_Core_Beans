package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(scopeName = "singleton")
public class Person {
    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;
    private Animal animal;
    @Autowired
    private Rabbit rabbit;


    public Person() {
    }
    @Autowired
    public Person(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    public void callYourFavouriteAnimal() {
        animal.animalPlus();
        rabbit.animalPlus();
    }

    @PostConstruct
    public void init() {
        System.out.println("Class Person");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class destroyed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
