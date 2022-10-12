package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myCat", Pet.class);
        pet.say();
        Pet pet1 = context.getBean("myDog", Pet.class);
        pet1.say();
        context.close();
    }
    
}
