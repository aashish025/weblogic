package com.ibm.commerce.sample.commands;

import com.ibm.commerce.command.TaskCommandImpl;
import com.ibm.commerce.exception.ECException;

public class MyNewTaskCmdImpl extends TaskCommandImpl implements MyNewTaskCmd {
	private static final String COPYRIGHT = com.ibm.commerce.copyright.IBMCopyright.SHORT_COPYRIGHT;

	private java.lang.String inputUserName;
	private java.lang.String greetings;
	private java.lang.Integer inputPoints;

	public void setInputUserName(java.lang.String newInputUserName) {
		inputUserName = newInputUserName;
	}

	public void setInputPoints(Integer newInputPoints) {
		inputPoints = newInputPoints;
	}

	public void setGreetings(java.lang.String newGreetings) {
		greetings = newGreetings;
	}

	public java.lang.String getInputUserName() {
		return inputUserName;
	}

	public Integer getInputPoints() {
		return inputPoints;
	}

	public java.lang.String getGreetings() {
		return greetings;
	}

	public void performExecute() throws ECException {
		setGreetings("Hello " + getInputUserName());

	}

}
