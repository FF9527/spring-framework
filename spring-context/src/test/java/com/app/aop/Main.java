package com.app.aop;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @author:wuqi
 * @date:2020/3/2
 * @description:com.app.aop
 * @version:1.0
 */
@Configuration
@EnableAspectJAutoProxy
public class Main {

	@Test
    public void aopTest(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.app.aop");
        context.refresh();
        Xxable a = (Xxable)context.getBean("a");
        B b = (B) context.getBean("b");
//        a.yy();
		b.xx();
        b.yy();
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
    }
}
