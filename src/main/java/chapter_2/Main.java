package chapter_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Parrot2 parrot2 = context.getBean(Parrot2.class);

        Person person = context.getBean(Person.class);

        System.out.println(person.getName());
        System.out.println(parrot2.getName());
        System.out.println(person.getParrot2());
    }
}
