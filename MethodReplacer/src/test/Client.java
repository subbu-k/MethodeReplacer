package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Bank;

public class Client {

	public static void main(String[] args) {
		ApplicationContext ap= new ClassPathXmlApplicationContext("resources/Spring.xml");
		Bank b=(Bank)ap.getBean("b");
		System.out.println(b.getClass().getCanonicalName());
		b.deposit();
		b.calInt();
	}
}
