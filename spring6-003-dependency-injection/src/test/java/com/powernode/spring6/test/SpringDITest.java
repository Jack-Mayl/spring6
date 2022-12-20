package com.powernode.spring6.test;

import com.powrnode.spring6.bean.*;
import com.powrnode.spring6.jdbc.MyDataSource;
import com.powrnode.spring6.jdbc.MyDataSource1;
import com.powrnode.spring6.jdbc.MyDataSource2;
import com.powrnode.spring6.service.CustomerService;
import com.powrnode.spring6.service.OrderDaoService;
import com.powrnode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;

import java.util.Date;

/**
 * @ClassName : SpringDITest
 * @Author : 龙仔
 * @Data ： 2022/11/9 15:25
 **/
public class SpringDITest {
    public static void main(String[] args) {
        System.out.println(new Date());
    }

    @Test
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("srping-properties.xml");
        MyDataSource ds = applicationContext.getBean("ds", MyDataSource.class);
        System.out.println(ds);
    }

    @Test
    public void testAutoWire(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
//        OrderDaoService orderService = applicationContext.getBean("orderService", OrderDaoService.class);
//        orderService.generate();
        CustomerService cs = applicationContext.getBean("cs", CustomerService.class);
        cs.save();
    }

    @Test
    public void testSpringUtil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 ds1 = applicationContext.getBean("ds1", MyDataSource1.class);
        MyDataSource2 ds2 = applicationContext.getBean("ds2", MyDataSource2.class);
        System.out.println(ds1);
        System.out.println(ds2);
    }

    @Test
    public void testSpringC(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }

    @Test
    public void testSpringP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
    }

    @Test
    public void testSpecial(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-math.xml");
        MathBean mathBean = applicationContext.getBean("mathBean", MathBean.class);
        System.out.println(mathBean);
    }

    @Test
    public void testNull(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-null.xml");
        Cat catName = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catName.getName().toUpperCase());
    }
    @Test
    public void testPerson(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
    }

    @Test
    public void testArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuQian = applicationContext.getBean("yuQian", QianDaYe.class);
        System.out.println(yuQian);
    }

    @Test
    public void testCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(clazzBean);
    }

    @Test
    public void testMyDataSource(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testSimpleTypeSet(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
//        User userBean = applicationContext.getBean("userBean", User.class);
//        System.out.println(userBean);
        SimpleValueType svt = applicationContext.getBean("svt", SimpleValueType.class);
        System.out.println(svt);
    }

    @Test
    public void testSetDI2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderDaoService orderServiceBean = applicationContext.getBean("orderDaoServiceBean2", OrderDaoService.class);
        orderServiceBean.generate();
    }

    @Test
    public void textConstructorDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext2.xml");
//        CustomerService csBean = applicationContext.getBean("csBean", CustomerService.class);
//        csBean.save();
//        CustomerService csBean2 = applicationContext.getBean("csBean2", CustomerService.class);
//        csBean2.save();
        CustomerService csBean3 = applicationContext.getBean("csBean3", CustomerService.class);
        csBean3.save();
    }


    @Test
    public void testSetDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.savaUser();
    }
}
