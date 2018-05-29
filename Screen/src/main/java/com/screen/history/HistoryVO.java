package com.screen.history;

public class HistoryVO {
	/*
	 * CREATE TABLE KOR1.HISTORY (
	      HS_NO VARCHAR2(2) NOT NULL,
	      HS_DATE DATE DEFAULT sysdate   NOT NULL,
	      HS_TARGET NUMBER DEFAULT 0           NOT NULL,
	      HS_FINISH NUMBER DEFAULT 0           NOT NULL,
	      HS_GOOD NUMBER DEFAULT 0           NOT NULL
	   );

	 */

	private String hsNo; // ���� �����丮 ��ȣ
	private String hsDate; // ���� �����丮 ��¥
	private int hsTarget; // ���� �����丮 ��ǥ��
	private int hsFinish; // ���� �����丮 ó����
	private int hsGood; // ���� �����丮 ��ǰ���귮
	
	public String getHsNo() {
		return hsNo;
	}
	public void setHsNo(String hsNo) {
		this.hsNo = hsNo;
	}
	public String getHsDate() {
		return hsDate;
	}
	public void setHsDate(String hsDate) {
		this.hsDate = hsDate;
	}
	public int getHsTarget() {
		return hsTarget;
	}
	public void setHsTarget(int hsTarget) {
		this.hsTarget = hsTarget;
	}
	public int getHsFinish() {
		return hsFinish;
	}
	public void setHsFinish(int hsFinish) {
		this.hsFinish = hsFinish;
	}
	public int getHsGood() {
		return hsGood;
	}
	public void setHsGood(int hsGood) {
		this.hsGood = hsGood;
	}
	
	
	

}
