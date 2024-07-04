package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot koko = new Parrot("Koko");

        Supplier<Parrot> parrotSupplier = () -> koko;

        context.registerBean("koko", Parrot.class, parrotSupplier);

        Parrot parrot = context.getBean(Parrot.class);
        System.out.println(parrot.getName());
    }
}
