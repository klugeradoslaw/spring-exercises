package pl.klugeradoslaw.ex14validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Ex13ValidationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Ex13ValidationApplication.class, args);
        PersonService personService = context.getBean((PersonService.class));

        Person person1 = new Person("Jan", "Kowalski", "jan@gmail.com", 35);
        System.out.println("adding" + person1);
        personService.addPerson(person1);

        Person person2 = new Person("J", "Kowalski", "jan@gmail.com", 35);
        System.out.println("adding" + person2);
        personService.addPerson(person2);

        Person person3 = new Person("J", "Kowalski", "jangmail.com", 0);
        System.out.println("adding" + person3);
        personService.addPerson(person3);

        System.out.println(personService);

    }
}
