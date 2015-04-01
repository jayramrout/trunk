package com.tutorial.spring.orm_03.SelectAll;


import org.springframework.core.io.*;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;

public class Client {
    public static void main(String[] args) {
        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("demo.xml"));
        EventDao ed = (EventDao) factory.getBean("id4");


        EventDO ep = new EventDO();
        ep.setEventid(new Integer(4));
        ep.setEventname("ActionEvent");
        ed.saveObject(ep);


        ed.selectAll();
        System.out.println("completed...");

    }

}
