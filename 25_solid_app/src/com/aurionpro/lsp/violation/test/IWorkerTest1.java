package com.aurionpro.lsp.violation.test;

import com.aurionpro.lsp.violation.model.IWorker1;
import com.aurionpro.lsp.violation.model.Labour1;
import com.aurionpro.lsp.violation.model.Robot1;

public class IWorkerTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Labour1 labour = new Labour1();
		labour.startWork();
		labour.stopWork();
		labour.eat();
		labour.drink();
		
		Robot1 robot = new Robot1();
		robot.startWork();
		robot.stopWork();

	}

}
