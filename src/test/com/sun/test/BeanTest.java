package com.sun.test;

import com.sun.bean.Customer;
import com.sun.bean.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class BeanTest {

    @Test
    public void  PersonTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p1 = ctx.getBean("p1",Person.class);
        System.out.println(p1.getName()+p1.getAge());
    }

    @Test
    public void  PersonTest1(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person p2 = ctx.getBean("p2",Person.class);
        System.out.println(p2.getName()+"_"+p2.getBirth());
    }

    @Test
    public void  PersonTest2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer c1 = (Customer)ctx.getBean("c1");
        System.out.println(c1.getMaps().size());
        System.out.println(c1.getMaps().get("A2").getName());
    }

    @Test
    public void  PersonTest3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Customer c2 = (Customer)ctx.getBean("c2");
        System.out.println(c2.getPerson().getName());
    }
}
