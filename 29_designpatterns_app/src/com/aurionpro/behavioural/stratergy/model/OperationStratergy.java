package com.aurionpro.behavioural.stratergy.model;

public class OperationStratergy {
    private IOperation operation;

   // IOperation operation;

    public OperationStratergy(IOperation operation) {
     super();
     this.operation = operation;
    }

    public IOperation getOperation() {
     return operation;
    }

    public void setOperation(IOperation operation) {
     this.operation = operation;
    }
    
    public void doOperation(int a, int b) {
     operation.doOperation(10, 20);
    }
    

   }


