package com.klu.Epam6;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
/**
 * Hello world!
 *
 */
public class App 
{
	public static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        custom_collection<Integer> Myth=new custom_collection<Integer>();
        Myth.add(1);
        Myth.add(34);
        Myth.add(1233);
        Myth.add(989);
        
        Myth.remove(34);
        Myth.remove(1233);
        Myth.remove(989);
        LOGGER.error(Myth.get(1233));
        LOGGER.error(Myth.get(989));
        
    }
}
