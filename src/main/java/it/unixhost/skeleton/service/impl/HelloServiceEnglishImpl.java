package it.unixhost.skeleton.service.impl;

import it.unixhost.skeleton.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: daniele
 * Package: it.unixhost.skeleton.service.impl
 */
@Component("helloServiceEnglish")
public class HelloServiceEnglishImpl implements HelloService
{
    @Override
    public String getHello()
    {
        return "Hello";
    }
}
