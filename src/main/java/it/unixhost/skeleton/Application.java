package it.unixhost.skeleton;

import it.unixhost.skeleton.service.NameService;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: daniele
 * Package: it.unixhost.skeleton
 */
public class Application
{
    public static void main(String[] args)
    {
        new Application().init();
    }

    public void init()
    {
        //create context
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        //service
        NameService nameService = (NameService) context.getBean("nameService");
        System.out.println(nameService.getName());

        //close context
        context.close();
    }
}