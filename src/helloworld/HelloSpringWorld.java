package helloworld;

import org.springframework.stereotype.Service;

@Service
public class HelloSpringWorld
{
	public void greeting(String name)
	{
		System.out.println("Hello and welcome to Spring: " + name);
	}
}
