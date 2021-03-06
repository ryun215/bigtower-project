package com.team4.project.hospital.treatChart.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.team4.project.hospital.dto.HoDisease;
import com.team4.project.hospital.dto.HoOperationType;
import com.team4.project.hospital.dto.HoTest;
import com.team4.project.hospital.dto.HoVaccineType;
import com.team4.project.hospital.treatChart.domain.HoChart;
import com.team4.project.hospital.treatChart.domain.HoTreat;
import com.team4.project.hospital.treatChart.domain.HoTreatSub;

@Repository
public class HoTreatChartDao {

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//차트생성
	public int addChart(HoChart hoChart){
		return sqlSession.insert("hoTreatChart.addChart", hoChart);
	}
	
	//진료 상세보기
	public HoTreatSub treatView(String hoTreatmentCode){
		return sqlSession.selectOne("hoTreatChart.treatView", hoTreatmentCode);
	}

	//진료목록
	public List<HoTreatSub> treatLsit(String hospitalCode) {
		return sqlSession.selectList("hoTreatChart.treatmentList", hospitalCode);
	}
	
	//수술 이름 가져오기
	public List<HoOperationType> selectOperation() {
		return sqlSession.selectList("hoTreatChart.selectOperation");
	}
	
	//검사 이름 가져오기
	public List<HoTest> selectTest() {
		return sqlSession.selectList("hoTreatChart.selectTest");
	}
	
	//질병 이름 가져오기
	public List<HoDisease> selectDisease() {
		return sqlSession.selectList("hoTreatChart.selectDisease");
	}
	
	//백신타입 이름 가져오기
	public List<HoVaccineType> selectVaccine() {
		return sqlSession.selectList("hoTreatChart.selectVaccine");
	}
	
	//환자코드에 맞는 차트코드 가져오기
	public String selectChartCode(Map<String, String> map){
		return sqlSession.selectOne("hoTreatChart.selectChartCode", map);
	}
	
	//접수완료 클릭시 진료 데이터 생성
	public int addTreat(HoTreat hoTreat){
		return sqlSession.insert("hoTreatChart.addTreat",hoTreat);
	}
	
	//진료 상세보기에서 진료업데이트
	public int updateTreat(HoTreat hoTreat){
		return sqlSession.update("hoTreatChart.updateTreat",hoTreat);
	}
}
