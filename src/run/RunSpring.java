package run;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import helloworld.HelloSpringWorld;

public class RunSpring
{
	public static void main(String[] args)
	{
		ApplicationContext appContext = new ClassPathXmlApplicationContext("bean-data.xml");
		BeanFactory beanFactory = appContext;
		HelloSpringWorld instance = (HelloSpringWorld) beanFactory.getBean("helloSpringWorld");
		instance.greeting("Chad");
	}
}