package com.screen.material;

public class MaterialVO {
/*
 * CREATE TABLE KOR1.MATERIAL (
      MT_NO NUMBER(10 , 0) NOT NULL,
      MT_TYPE VARCHAR2(1) NOT NULL,
      MT_UNIT NUMBER NOT NULL,
      MT_IDATE DATE NOT NULL,
      MT_ODATE DATE
   );
 */
	private int mtNo; // 자재 번호
	private String mtType; // 자재 종류 (H:손잡이/P:페인트)
	private int mtUnit; // 자재 용량
	private String mtIdate; // 자재 입고일자 (sysdate)
	private String mtOdate; // 자재 출고일자 (sysdate)
	
	
	public int getMtNo() {
		return mtNo;
	}
	public void setMtNo(int mtNo) {
		this.mtNo = mtNo;
	}
	public String getMtType() {
		return mtType;
	}
	public void setMtType(String mtType) {
		this.mtType = mtType;
	}
	public int getMtUnit() {
		return mtUnit;
	}
	public void setMtUnit(int mtUnit) {
		this.mtUnit = mtUnit;
	}
	public String getMtIdate() {
		return mtIdate;
	}
	public void setMtIdate(String mtIdate) {
		this.mtIdate = mtIdate;
	}
	public String getMtOdate() {
		return mtOdate;
	}
	public void setMtOdate(String mtOdate) {
		this.mtOdate = mtOdate;
	}
	
	
}
