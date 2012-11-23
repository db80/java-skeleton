package it.unixhost.skeleton.test;

import it.unixhost.skeleton.service.NameService;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertTrue;

/**
 * User: daniele
 * Package: it.unixhost.skeleton.test
 */
public class NameServiceTest
{
    private static Logger logger = Logger.getLogger(NameServiceTest.class);

    private AbstractApplicationContext applicationContext;

    private NameService nameService;

    @Before
    public void setUp()
    {
        logger.debug("SetUp");
        applicationContext = new ClassPathXmlApplicationContext("test-context.xml");
        nameService = (NameService) applicationContext.getBean("nameService");
    }

    @After
    public void tearDown()
    {
        logger.debug("tearDown");
        applicationContext.close();
    }

    @Test
    public void testGetNameMethod()
    {
        logger.debug("Test Service Method getName()");
        assertTrue( "Name is not Daniele", nameService.getName().equals("Hello Daniele"));
    }
}