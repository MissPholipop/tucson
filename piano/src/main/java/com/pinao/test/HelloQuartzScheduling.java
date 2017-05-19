package com.pinao.test;

import java.text.ParseException;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class HelloQuartzScheduling {
    
    public static void main(String[] args) 
       throws SchedulerException, ParseException {
       
       SchedulerFactory schedulerFactory = new StdSchedulerFactory();
       Scheduler scheduler = schedulerFactory.getScheduler();
       
       scheduler.start();              
    }   
}