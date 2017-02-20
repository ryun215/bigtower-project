package com.team4.project.government.treatChart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.project.government.diagnosisPrescription.domain.GoDiagnosis;
import com.team4.project.government.treatChart.domain.GoTreat;

@Service
public class GoTreatChartService {

	@Autowired
	private GoTreatChartDao goTCD;
	
	//진료 상세보기
	public GoTreat goSelectTreat(String goTreatCode){
		return goTCD.goSelectTreat(goTreatCode);
	}
	
	//진료목록
	public List<GoTreat> goTreatList(){
		List<GoTreat> goTreatList = goTCD.goTreatList();
		System.out.println("goTreatList:"+goTreatList);
		//진료코드를 이용하여 질병 목록들을 가져오기 위해  for문을 사용한다.
		for(int i=0;i<goTreatList.size();i++){
			String goTreatCode = goTreatList.get(i).getGoTreatCode();
			List<GoDiagnosis> diagnosisList = goTCD.goDiagnosisList(goTreatCode);
			goTreatList.get(i).setDiagnosisList(diagnosisList);
		}
		
		return goTreatList;
	}
	
	//동일한 진료코드의 질병코드 리스트 가져오기
	public List<GoDiagnosis> goDiagnosisList(String goTreatCode){
		
		return goTCD.goDiagnosisList(goTreatCode);
	}
}
