package com.aurionpro.test;
import java.io.ObjectInput;
import java.lang.reflect.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
public class ReflectionOfString {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.getName());
		System.out.println(stringClass.getSimpleName());
		System.out.println(stringClass.getSuperclass());
		
		System.out.println("Methods:");
		
		Method stringMethods[]=stringClass.getMethods();
		for(Method method: stringMethods)
		{
			System.out.println(method.getName()+"\t"+method.getParameterCount());
			
		}
		System.out.println("Constructors:");
		
		Constructor stringConstructors[]= stringClass.getConstructors();
		
		for(Constructor constructor:stringConstructors)
				
		{
			Parameter parameters[] = constructor.getParameters();
			for(Parameter parameter:parameters)
		    {
			System.out.println(constructor.getName()+"\t"+parameter.getName());
		    }
		}
	

}
}
