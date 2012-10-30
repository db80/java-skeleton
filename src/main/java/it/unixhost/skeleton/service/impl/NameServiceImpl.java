package it.unixhost.skeleton.service.impl;

import it.unixhost.skeleton.service.NameService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * User: daniele
 * Package: it.unixhost.skeleton.service.impl
 */
@Component("nameServiceImpl")
public class NameServiceImpl implements NameService
{
    private static Logger logger = Logger.getLogger(NameServiceImpl.class);

    @Value("${application.name}")
    private String name;

    @Override
    public String getName()
    {
        logger.debug("Get name " + name);
        return name;
    }
}