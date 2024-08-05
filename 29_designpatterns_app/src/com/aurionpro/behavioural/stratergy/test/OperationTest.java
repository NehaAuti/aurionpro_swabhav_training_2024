package com.aurionpro.behavioural.stratergy.test;

import com.aurionpro.behavioural.stratergy.model.AddOperation;
import com.aurionpro.behavioural.stratergy.model.MultiplyOperation;
import com.aurionpro.behavioural.stratergy.model.OperationStratergy;

public class OperationTest {
 public static void main(String[] args) {
  
  OperationStratergy operation=new OperationStratergy(new AddOperation());
  operation.doOperation(10, 20);
  
  
  operation.setOperation(new MultiplyOperation());
  operation.doOperation(10, 20);
  
  
 }

}