package chapter_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Chapter2App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);

        Parrot2 parrot2 = context.getBean(Parrot2.class);
        parrot2.setName("Koko");

        Person person = context.getBean(Person.class);
        person.setName("David");

        System.out.println(person.getName());
        System.out.println(person.getParrot2());
    }
}
