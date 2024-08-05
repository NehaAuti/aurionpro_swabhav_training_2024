package com.aurionpro.test;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.aurionpro.model.Account;
public class AccountTest {

	public static void main(String[] args)throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException  {
        Constructor<Account> constructor = Account.class.getConstructor(String.class, double.class);
        
        // Creating instances using the constructor
       Account account1 = constructor.newInstance("12345", 1000.0);
       Account account2 = constructor.newInstance("67890", 2000.0);
       Account account3 = constructor.newInstance("54321", 3000.0);
        
        
        System.out.println("Number of Account created: " + Account.getCount());
    }
}
