package com.screen.machine;

public class MachineVO {
/*
 * CREATE TABLE KOR1.MACHINE (
      MC_NO VARCHAR2(20) NOT NULL,
      MC_MAKER VARCHAR2(20) NOT NULL,
      MC_TEL VARCHAR2(20) NOT NULL,
      MC_PROCESS VARCHAR2(2) NOT NULL,
      MC_STATUS VARCHAR2(1) NOT NULL
   );
 */
	
	private String mcNo; // ��� ��ȣ
	private String mcMaker; // ��� ������
	private String mcTel; // ��� ������ ����ó
	private String mcProcess; // �Ҽ� ���� ��ȣ
	private String mcStatus; // ��� ����
	
	
	public String getMcNo() {
		return mcNo;
	}
	public void setMcNo(String mcNo) {
		this.mcNo = mcNo;
	}
	public String getMcMaker() {
		return mcMaker;
	}
	public void setMcMaker(String mcMaker) {
		this.mcMaker = mcMaker;
	}
	public String getMcTel() {
		return mcTel;
	}
	public void setMcTel(String mcTel) {
		this.mcTel = mcTel;
	}
	public String getMcProcess() {
		return mcProcess;
	}
	public void setMcProcess(String mcProcess) {
		this.mcProcess = mcProcess;
	}
	public String getMcStatus() {
		return mcStatus;
	}
	public void setMcStatus(String mcStatus) {
		this.mcStatus = mcStatus;
	}
	
}
