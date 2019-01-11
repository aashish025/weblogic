package com.ibm.commerce.sample.databeans;

import javax.ejb.CreateException;

import com.ibm.commerce.beans.SmartDataBean;
import com.ibm.commerce.command.CommandContext;
import com.ibm.commerce.datatype.TypedProperty;
import com.ibm.commerce.extension.objects.BonusAccessBean;



public class BonusDataBean extends BonusAccessBean implements SmartDataBean {
	public static final String COPYRIGHT = com.ibm.commerce.copyright.IBMCopyright.SHORT_COPYRIGHT;
	private CommandContext iCommandContext = null;
	private com.ibm.commerce.datatype.TypedProperty requestProperties;
	private java.lang.String userId;
	private java.lang.Integer totalBonusPoints;

	public java.lang.String getUserId() {
		return userId;
	}

	public void setUserId(java.lang.String newUserId) {
		userId = newUserId;
		if (userId != null)
			this.setInitKey_memberId(new Long(newUserId));

	}

	public void setInitKey_memberId(Long long1) {
		// TODO Auto-generated method stub
		
	}

	public java.lang.Integer getTotalBonusPoints() {
		return totalBonusPoints;
	}

	public void setTotalBonusPoints(java.lang.Integer newTotalBonusPoints) {
		totalBonusPoints = newTotalBonusPoints;
	}

	public BonusDataBean() {
		super();
	}

	public BonusDataBean(BonusAccessBean bb)
			throws com.ibm.commerce.exception.ECException {
		super.setEJBRef(bb.getEJBRef());
	}

	public void populate() throws com.ibm.commerce.exception.ECException,
			CreateException, javax.ejb.FinderException {

		super.refreshCopyHelper();

	}

	public com.ibm.commerce.command.CommandContext getCommandContext() {
		return iCommandContext;
	}

	public void setCommandContext(
			com.ibm.commerce.command.CommandContext aCommandContext) {
		iCommandContext = aCommandContext;
	}

	public TypedProperty getRequestProperties() {
		return requestProperties;
	}

	public void setRequestProperties(
			com.ibm.commerce.datatype.TypedProperty aParam) {
		requestProperties = aParam;

	}
}
