package com.aurionpro.threading.model;

import java.util.Random;
import java.util.concurrent.Callable;

public class NewTask implements Callable<Integer>{
      public Integer call() throws Exception
      {
    	  
		return (int)(Math.random()*1000);
    	  
      }
}
