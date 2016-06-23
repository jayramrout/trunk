package com.tutorial.spring.orm_03._03SpringHibernateApproach2;

import org.springframework.orm.hibernate4.HibernateTemplate;

import java.util.Iterator;
import java.util.List;

public class DemoImpl implements DemoInter {

    private HibernateTemplate ht = null;
    public void setHt(HibernateTemplate ht) {
        System.out.println("setter of spring");
        this.ht = ht;
    }
    public Iterator getData() throws Exception {
        System.out.println("In spring class getData()");
        List l = ht.find("from User");
        Iterator i1 = l.iterator();
        return i1;
    }
}
