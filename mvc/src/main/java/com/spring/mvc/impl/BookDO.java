package com.spring.mvc.impl;

public class BookDO {
	private int seq;
	private String date; //��¥
	private String time; //�ð�
	private String sym; //����, ���� ����
	
	private String name;   //�̸�
	private String registerNum;  //�ֹε�Ϲ�ȣ
	private String num; //�ڵ��� ��ȣ
	private String email; //�̸���

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
