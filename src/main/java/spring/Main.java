package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot koko = context.getBean("koko", Parrot.class);
        System.out.println(koko.getName());

        String string = context.getBean(String.class);
        System.out.println(string);

        int n = context.getBean(Integer.class);
        System.out.println(n);

        Parrot kesha = context.getBean("kesha", Parrot.class);
        System.out.println(kesha.getName());

        Parrot vasia = context.getBean("vasia", Parrot.class);
        System.out.println(vasia.getName());
    }
}
