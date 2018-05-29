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
	
	private String psNo; // 공정 번호
	private int psStock; // 해당 공정 자재 잔량
	private int psTarget; // 공정 목표량
	private int psFinish; // 공정 처리량
	
	
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
