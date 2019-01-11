package com.ibm.commerce.sample.commands;

import com.ibm.commerce.command.ControllerCommand;

public interface MyNewControllerCmd extends ControllerCommand {
	public static final String COPYRIGHT = com.ibm.commerce.copyright.IBMCopyright.SHORT_COPYRIGHT;

	public java.lang.Integer getPoints();

	public java.lang.String getUserName();

	public void setPoints(java.lang.Integer newPoints);

	public void setUserName(java.lang.String newUserName);

}
