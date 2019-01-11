package com.ibm.commerce.sample.databeans;

import com.ibm.commerce.beans.SmartDataBean;
import com.ibm.commerce.beans.SmartDataBeanImpl;

public class MyNewDataBean extends SmartDataBeanImpl implements SmartDataBean  {
	public static final String COPYRIGHT =
			com.ibm.commerce.copyright.IBMCopyright.SHORT_COPYRIGHT;
	
	private java.lang.String callingCommandName = null;
	private boolean calledByControllerCmd = false;
	
	public java.lang.String getCallingCommandName() {
	return callingCommandName;
	}

	public void setCallingCommandName(java.lang.String
	newCallingCommandName) {
	callingCommandName = newCallingCommandName;
	}

	public boolean getCalledByControllerCmd() {
	return calledByControllerCmd;
	}

	public void setCalledByControllerCmd(boolean
	newCalledByControllerCmd) {
	calledByControllerCmd = newCalledByControllerCmd;
	}
	private java.lang.String userName = null;
	private java.lang.Integer points;
	

	public String getUserName() {
	return userName;
	}

	public void setUserName(java.lang.String newUserName) {
	userName = newUserName;
	}


	public Integer getPoints() {
	return points;
	}

	public void setPoints(java.lang.Integer newPoints) {
	points = newPoints;
	}	
	public MyNewDataBean() {
	super();
	}

	public void populate() throws
	com.ibm.commerce.exception.ECException {

	}
}
