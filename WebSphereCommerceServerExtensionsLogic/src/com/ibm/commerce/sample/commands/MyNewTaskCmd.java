package com.ibm.commerce.sample.commands;

import com.ibm.commerce.command.TaskCommand;

public interface MyNewTaskCmd extends TaskCommand {
	static final String defaultCommandClassName = "com.ibm.commerce.sample.commands.MyNewTaskCmdImpl";

	public void setInputUserName(java.lang.String inputUserName);

	public void setInputPoints(Integer inputPoints);

	public void setGreetings(java.lang.String greeting);

	public java.lang.String getInputUserName();

	public java.lang.Integer getInputPoints();

	public java.lang.String getGreetings();

}
