package com.team4.project.government.vaccinationCheckup.domain;

import java.util.List;

public class GoVaccinationCheckup {
	protected String goCitizenId;
	protected List<GoCheckupTreatSub> goCheckupTreatSub;
	protected List<GoVaccinationResultTreatSub> goVaccinationResultTreatSub;
	protected String firstDate;
	protected String secondDate;
	
	
	public String getGoCitizenId() {
		return goCitizenId;
	}


	public void setGoCitizenId(String goCitizenId) {
		this.goCitizenId = goCitizenId;
	}


	public List<GoCheckupTreatSub> getGoCheckupTreatSub() {
		return goCheckupTreatSub;
	}


	public void setGoCheckupTreatSub(List<GoCheckupTreatSub> goCheckupTreatSub) {
		this.goCheckupTreatSub = goCheckupTreatSub;
	}


	public List<GoVaccinationResultTreatSub> getGoVaccinationResultTreatSub() {
		return goVaccinationResultTreatSub;
	}


	public void setGoVaccinationResultTreatSub(List<GoVaccinationResultTreatSub> goVaccinationResultTreatSub) {
		this.goVaccinationResultTreatSub = goVaccinationResultTreatSub;
	}


	public String getFirstDate() {
		return firstDate;
	}


	public void setFirstDate(String firstDate) {
		this.firstDate = firstDate;
	}


	public String getSecondDate() {
		return secondDate;
	}


	public void setSecondDate(String secondDate) {
		this.secondDate = secondDate;
	}


	@Override
	public String toString() {
		return "GoVaccinationCheckup [goCitizenId=" + goCitizenId + ", goCheckupTreatSub=" + goCheckupTreatSub
				+ ", firstDate=" + firstDate
				+ ", secondDate=" + secondDate + "]";
	}
	
	
}