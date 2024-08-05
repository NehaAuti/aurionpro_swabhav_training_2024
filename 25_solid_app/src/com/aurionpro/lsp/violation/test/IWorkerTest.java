package com.aurionpro.lsp.violation.test;

import com.aurionpro.lsp.violation.model.IWorker;
import com.aurionpro.lsp.violation.model.Labour;
import com.aurionpro.lsp.violation.model.Robot;

public class IWorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IWorker labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		robot.eat();
		robot.drink();
		

	}

}
