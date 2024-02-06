package com.spring.mvc.impl;

public class BookDO {
	private int seq;
	private String date; //날짜
	private String time; //시간
	private String sym; //증상, 사유 이유
	
	private String name;   //이름
	private String registerNum;  //주민등록번호
	private String num; //핸드폰 번호
	private String email; //이메일

	@Override
	public String toString() {
		return "BookDO [date=" + date + ", "
				+ "time=" + time + ", sym=" + sym + 
				", name=" + name + ", registerNum=" + registerNum +","
						+ ",num ="+num+", email =" + email+"]";
	}
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSym() {
		return sym;
	}
	public void setSym(String sym) {
		this.sym = sym;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegisterNum() {
		return registerNum;
	}
	public void setRegisterNum(String registerNum) {
		this.registerNum = registerNum;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


}
