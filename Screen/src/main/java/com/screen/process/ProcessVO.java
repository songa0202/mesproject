package com.screen.process;

public class ProcessVO {
/*
 * CREATE TABLE KOR1.PROCESS (
      PS_NO VARCHAR2(2) NOT NULL,
      PS_STOCK NUMBER DEFAULT 0   NOT NULL,
      PS_TARGET NUMBER,
      PS_FINISH NUMBER
   );
 */
	
	private String psNo; // ���� ��ȣ
	private int psStock; // �ش� ���� ���� �ܷ�
	private int psTarget; // ���� ��ǥ��
	private int psFinish; // ���� ó����
	
	
	public String getPsNo() {
		return psNo;
	}
	public void setPsNo(String psNo) {
		this.psNo = psNo;
	}
	public int getPsStock() {
		return psStock;
	}
	public void setPsStock(int psStock) {
		this.psStock = psStock;
	}
	public int getPsTarget() {
		return psTarget;
	}
	public void setPsTarget(int psTarget) {
		this.psTarget = psTarget;
	}
	public int getPsFinish() {
		return psFinish;
	}
	public void setPsFinish(int psFinish) {
		this.psFinish = psFinish;
	}
	
	

}
