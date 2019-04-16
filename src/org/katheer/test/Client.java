package org.katheer.test;

import org.katheer.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        /*
        autowire-candidate=false
        ---------------
        Using this attribute, we can exclude a bean from autowiring.
        In byType method, if two beans has same types, we'll get exception.
        But if we disable autowiring for one bean using this attribute, then we
            won't get exception.
         */
        ApplicationContext context = new ClassPathXmlApplicationContext
                ("org/katheer/resource/applicationContext.xml");
        Student std1 = (Student) context.getBean("std1");
        std1.showStudentDetails();
    }
}
