package it.unixhost.skeleton.service.impl;

import it.unixhost.skeleton.service.HelloService;
import it.unixhost.skeleton.service.NameService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * User: daniele
 * Package: it.unixhost.skeleton.service.impl
 */
@Component("nameService")
public class NameServiceImpl implements NameService
{
    private static Logger logger = Logger.getLogger(NameServiceImpl.class);

    @Autowired
    @Qualifier("helloServiceEnglish")
    private HelloService helloService;

    @Value("${application.name}")
    private String name;

    @Override
    public String getName()
    {
        logger.debug("Get name " + name);
        return helloService.getHello() + " " + name;
    }

    @Override
    @PostConstruct
    public void postConstruct()
    {
        logger.debug("postConstruct");
    }

    @Override
    @PreDestroy
    public void preDestroy()
    {
        logger.debug("preDestroy");
    }
}