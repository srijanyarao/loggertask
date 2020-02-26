package epamtask.loggers;
import java.util .*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Interest 
{
	private static final Logger LOGGER = LogManager.getLogger(Interest.class); 
    public static void main (String argu[ ])
{
    double pr, rate, t, sim,com;
    Scanner sc=new Scanner (System. in);
    LOGGER.info("enter the amount: ");
    pr=sc.nextDouble();
    LOGGER.info("enter the no of years:");
    t=sc.nextDouble();
    LOGGER.info("enter the rate of interest");
    rate=sc.nextDouble();
    sim=(pr * t * rate)/100;
    com=pr * Math.pow(1.0+rate/100.0,t) - pr;
    LOGGER.debug("simple interest="+sim);
    LOGGER.debug("compound interest="+com);
    LOGGER.info("simple interest="+sim);
    LOGGER.info("compound interest="+com);
    LOGGER.warn("simple interest="+sim);
    LOGGER.warn("compound interest="+com);
    LOGGER.error("simple interest="+sim);
    LOGGER.error("compound interest="+com);
    LOGGER.fatal("simple interest="+sim);
    LOGGER.fatal("compound interest="+com);
   }
   }
    
    
    
