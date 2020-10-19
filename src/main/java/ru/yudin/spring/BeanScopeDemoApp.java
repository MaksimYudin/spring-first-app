package ru.yudin.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context
                = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        Coach myCoach = context.getBean("myCoach", Coach.class);
        Coach newCoach = context.getBean("myCoach", Coach.class);

        Boolean result = (myCoach == newCoach);

        System.out.println("myCoach is same that newCoach: " + result);
        System.out.println("myCoach memory address: " + myCoach);
        System.out.println("newCoach memory address: " + newCoach);

        context.close();
    }
}
