package com.ibm.commerce.sample.commands;

import com.ibm.commerce.command.CommandFactory;
import com.ibm.commerce.command.ControllerCommandImpl;
import com.ibm.commerce.datatype.TypedProperty;
import com.ibm.commerce.exception.ECApplicationException;
import com.ibm.commerce.exception.ECException;
import com.ibm.commerce.exception.ParameterNotFoundException;
import com.ibm.commerce.ras.ECMessage;
import com.ibm.commerce.ras.ECMessageHelper;
import com.ibm.commerce.sample.databeans.MyNewDataBean;
import com.ibm.commerce.server.ECConstants;

public class MyNewControllerCmdImpl extends ControllerCommandImpl implements
		MyNewControllerCmd {
	private static final String COPYRIGHT = com.ibm.commerce.copyright.IBMCopyright.SHORT_COPYRIGHT;
	private java.lang.String userName = null;
	private java.lang.Integer points;

	public java.lang.String getUserName() {
		return userName;
	}

	public void setUserName(java.lang.String userName) {
		this.userName = userName;
	}

	public java.lang.Integer getPoints() {
		return points;
	}

	public void setPoints(java.lang.Integer points) {
		this.points = points;
	}

	public void performExecute() throws ECException {
		super.performExecute();
		String message1 = "hello";
		MyNewDataBean mndb = new MyNewDataBean();
		mndb.setCallingCommandName(this.getClass().getName());
		mndb.setCalledByControllerCmd(true);
		mndb.setUserName(this.getUserName());
		mndb.setPoints(this.getPoints());
		TypedProperty rspProp = new TypedProperty();
		rspProp.put(ECConstants.EC_VIEWTASKNAME, "MyNewView");
		rspProp.put("controllerParm1", message1);
		rspProp.put("controllerParm2", "Have a nice day!");
		rspProp.put("mndbInstance", mndb);
		MyNewTaskCmd cmd = null;

		try {

			cmd = (MyNewTaskCmd) CommandFactory.createCommand(
					"com.ibm.commerce.sample.commands.MyNewTaskCmd",
					getStoreId());
			cmd.setCommandContext(getCommandContext());
			cmd.setInputUserName(getUserName());
			cmd.setInputPoints(getPoints()); // change to Integer
			cmd.execute();
			rspProp.put("taskOutputGreetings", cmd.getGreetings());
		} catch (ECException ex) {

			throw (ECException) ex;
		}
		setResponseProperties(rspProp);
	}

	public void validateParameters() throws ECApplicationException {

		final String strMethodName = "validateParameters";

		TypedProperty prop = getRequestProperties();

		try {
			setUserName(prop.getString("input1"));

		} catch (ParameterNotFoundException e) {

			throw new ECApplicationException(ECMessage._ERR_CMD_MISSING_PARAM,
					this.getClass().getName(), strMethodName,
					ECMessageHelper.generateMsgParms(e.getParamName()));
		}

		setPoints(prop.getInteger("input2", 0));

	}
}