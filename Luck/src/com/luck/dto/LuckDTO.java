package com.luck.dto;

import java.util.List;
import java.util.ArrayList;

public class LuckDTO {
	private String luckId = "";
	private int luckNo1 = 0;
	private int luckNo2 = 0;
	private int luckNo3 = 0;
	private String luckNo = "";
	private String insertDate = "";
	private String insertDay = "";
	
	private List<String> luckIdList = new ArrayList<>();
	private List<Integer> luckNo1List = new ArrayList<>();
	private List<Integer> luckNo2List = new ArrayList<>();
	private List<Integer> luckNo3List = new ArrayList<>();
	private List<String> luckNoList = new ArrayList<>();
	private List<String> insertDateList = new ArrayList<>();
	private List<String> insertDayList = new ArrayList<>();
	
	public String getLuckId() {
		return luckId;
	}
	public void setLuckId(String luckId) {
		this.luckId = luckId;
	}
	public int getLuckNo1() {
		return luckNo1;
	}
	public void setLuckNo1(int luckNo1) {
		this.luckNo1 = luckNo1;
	}
	public int getLuckNo2() {
		return luckNo2;
	}
	public void setLuckNo2(int luckNo2) {
		this.luckNo2 = luckNo2;
	}
	public int getLuckNo3() {
		return luckNo3;
	}
	public void setLuckNo3(int luckNo3) {
		this.luckNo3 = luckNo3;
	}
	public String getLuckNo() {
		return luckNo;
	}
	public void setLuckNo(String luckNo) {
		this.luckNo = luckNo;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public String getInsertDay() {
		return insertDay;
	}
	public void setInsertDay(String insertDay) {
		this.insertDay = insertDay;
	}
	public List<String> getLuckIdList() {
		return luckIdList;
	}
	public void setLuckIdList(List<String> luckIdList) {
		this.luckIdList = luckIdList;
	}
	public List<Integer> getLuckNo1List() {
		return luckNo1List;
	}
	public void setLuckNo1List(List<Integer> luckNo1List) {
		this.luckNo1List = luckNo1List;
	}
	public List<Integer> getLuckNo2List() {
		return luckNo2List;
	}
	public void setLuckNo2List(List<Integer> luckNo2List) {
		this.luckNo2List = luckNo2List;
	}
	public List<Integer> getLuckNo3List() {
		return luckNo3List;
	}
	public void setLuckNo3List(List<Integer> luckNo3List) {
		this.luckNo3List = luckNo3List;
	}
	public List<String> getLuckNoList() {
		return luckNoList;
	}
	public void setLuckNoList(List<String> luckNoList) {
		this.luckNoList = luckNoList;
	}
	public List<String> getInsertDateList() {
		return insertDateList;
	}
	public void setInsertDateList(List<String> insertDateList) {
		this.insertDateList = insertDateList;
	}
	public List<String> getInsertDayList() {
		return insertDayList;
	}
	public void setInsertDayList(List<String> insertDayList) {
		this.insertDayList = insertDayList;
	}
	
}
