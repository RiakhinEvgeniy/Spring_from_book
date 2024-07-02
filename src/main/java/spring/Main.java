package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot koko = context.getBean(Parrot.class);
        System.out.println(koko.getName());

        String string = context.getBean(String.class);
        System.out.println(string);

        int n = context.getBean(Integer.class);
        System.out.println(n);
    }
}
