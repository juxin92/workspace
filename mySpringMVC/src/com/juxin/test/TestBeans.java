package com.juxin.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.juxin.logic.impl.Chinese;

public class TestBeans {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

		Chinese p1 = ctx.getBean("chinese", Chinese.class);
		p1.useAxe();

		BeanFactory xte = new DefaultListableBeanFactory();
		Chinese p3 = ctx.getBean("chinese", Chinese.class);
		p3.useAxe();
	}
}
