package xml.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Human person = context.getBean("human", Human.class);
        System.out.println(person);

        Hamster hamster = context.getBean("hamster",Hamster.class);
        hamster.animalPlus();
        hamster.animalMinus();
        System.out.println(hamster);

        Tortoise tortoise = context.getBean("tortoise",Tortoise.class);
        tortoise.animalPlus();
        tortoise.animalMinus();
        System.out.println(tortoise);

        context.close();

    }
}
