package it.unixhost.skeleton.service;

import javax.annotation.PreDestroy;

/**
 * User: daniele
 * Package: it.unixhost.skeleton.service
 */
public interface NameService
{
    /**
     * Get Name Service
     * @return the name
     */
    public String getName();

    /**
     * Method called post bean construct
     */
    public void postConstruct();

    /**
     * Method called pre bean destroy
     */
    public void preDestroy();
}
