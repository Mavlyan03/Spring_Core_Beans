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
    private Animal animal2;

    public Person() {
    }
    @Autowired
    public Person(@Qualifier("dog") Animal animal,@Qualifier("rabbit") Animal animal2) {
        this.animal = animal;
        this.animal2 = animal2;
    }

    public void callYourFavouriteAnimal() {
        animal.animalPlus();
        animal2.animalPlus();
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

    public Animal getAnimal2() {
        return animal2;
    }

    public void setAnimal2(Animal animal2) {
        this.animal2 = animal2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
