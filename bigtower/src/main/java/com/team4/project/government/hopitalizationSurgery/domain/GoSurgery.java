package com.team4.project.government.hopitalizationSurgery.domain;

import org.springframework.format.annotation.DateTimeFormat;

public class GoSurgery{
	protected String goSurgeryResultCode;
	protected String goTreatCode;
	protected String goSurgeryCode;
	//날짜
	@DateTimeFormat(pattern="yyyy/MM/dd hh:mm:ss")
	protected String goSurgeryResultGoRegistrationDate;
	
	
	public String getGoSurgeryResultCode() {
		return goSurgeryResultCode;
	}
	public void setGoSurgeryResultCode(String goSurgeryResultCode) {
		this.goSurgeryResultCode = goSurgeryResultCode;
	}
	public String getGoTreatCode() {
		return goTreatCode;
	}
	public void setGoTreatCode(String goTreatCode) {
		this.goTreatCode = goTreatCode;
	}
	public String getGoSurgeryCode() {
		return goSurgeryCode;
	}
	public void setGoSurgeryCode(String goSurgeryCode) {
		this.goSurgeryCode = goSurgeryCode;
	}
	public String getGoSurgeryResultGoRegistrationDate() {
		return goSurgeryResultGoRegistrationDate;
	}
	public void setGoSurgeryResultGoRegistrationDate(String goSurgeryResultGoRegistrationDate) {
		this.goSurgeryResultGoRegistrationDate = goSurgeryResultGoRegistrationDate;
	}
	@Override
	public String toString() {
		return "GoSurgery [goS urgeryResultCode=" + goSurgeryResultCode + ", goTreatCode=" + goTreatCode
				+ ", goSurgeryCode=" + goSurgeryCode + ", goSurgeryResultGoRegistrationDate="
				+ goSurgeryResultGoRegistrationDate + "]";
	}
	
	
}
