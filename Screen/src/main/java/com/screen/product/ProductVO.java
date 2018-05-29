package com.screen.product;

public class ProductVO {
	
	/*
	 * CREATE TABLE KOR1.PRODUCT (
	      PT_NO NUMBER(10 , 0) NOT NULL,
	      PT_SEQNO NUMBER(10 , 0) NOT NULL,
	      PT_1END DATE DEFAULT sysdate,
	      PT_2END DATE,
	      PT_3END DATE,
	      PT_1WNO NUMBER,
	      PT_1WNAME VARCHAR2(50),
	      PT_2WNO NUMBER,
	      PT_2WNAME VARCHAR2(50),
	      PT_3WNO NUMBER,
	      PT_3WNAME VARCHAR2(50),
	      PT_PNO NUMBER(10 , 0),
	      PT_HNO NUMBER(10 , 0),
	      PT_1CHECK VARCHAR2(1),
	      PT_2CHECK VARCHAR2(1),
	      PT_3CHECK VARCHAR2(1)
	   );
	 */
	
	private int ptNo; // 제품번호
	private int ptSeqno; // 제품 생산순서
	private String pt1end; // 1공정 종료 시간 (sysdate)
	private String pt2end; // 2공정 종료 시간 (sysdate)
	private String pt3end; // 3공정 종료 시간 (sysdate)
	private int pt1wno; // 1공정 작업자 번호
	private String pt1wname; // 1공정 작업자 이름
	private int pt2wno; // 2공정 작업자 번호
	private String pt2wname; // 2공정 작업자 이름
	private int pt3wno; // 2-2공정 작업자 번호
	private String pt3wname; // 2-2공정 작업자 이름
	private int ptPno; // 페인트 자재 번호
	private int ptHno; // 손잡이 자재 번호
	private String pt1check; //  1공정 체크 상태
	private String pt2check; // 2공정 체크 상태
	private String pt3check; //  2-2공정 체크 상태
	
	
	public int getPtNo() {
		return ptNo;
	}
	public void setPtNo(int ptNo) {
		this.ptNo = ptNo;
	}
	public int getPtSeqno() {
		return ptSeqno;
	}
	public void setPtSeqno(int ptSeqno) {
		this.ptSeqno = ptSeqno;
	}
	public String getPt1end() {
		return pt1end;
	}
	public void setPt1end(String pt1end) {
		this.pt1end = pt1end;
	}
	public String getPt2end() {
		return pt2end;
	}
	public void setPt2end(String pt2end) {
		this.pt2end = pt2end;
	}
	public String getPt3end() {
		return pt3end;
	}
	public void setPt3end(String pt3end) {
		this.pt3end = pt3end;
	}
	public int getPt1wno() {
		return pt1wno;
	}
	public void setPt1wno(int pt1wno) {
		this.pt1wno = pt1wno;
	}
	public String getPt1wname() {
		return pt1wname;
	}
	public void setPt1wname(String pt1wname) {
		this.pt1wname = pt1wname;
	}
	public int getPt2wno() {
		return pt2wno;
	}
	public void setPt2wno(int pt2wno) {
		this.pt2wno = pt2wno;
	}
	public String getPt2wname() {
		return pt2wname;
	}
	public void setPt2wname(String pt2wname) {
		this.pt2wname = pt2wname;
	}
	public int getPt3wno() {
		return pt3wno;
	}
	public void setPt3wno(int pt3wno) {
		this.pt3wno = pt3wno;
	}
	public String getPt3wname() {
		return pt3wname;
	}
	public void setPt3wname(String pt3wname) {
		this.pt3wname = pt3wname;
	}
	public int getPtPno() {
		return ptPno;
	}
	public void setPtPno(int ptPno) {
		this.ptPno = ptPno;
	}
	public int getPtHno() {
		return ptHno;
	}
	public void setPtHno(int ptHno) {
		this.ptHno = ptHno;
	}
	public String getPt1check() {
		return pt1check;
	}
	public void setPt1check(String pt1check) {
		this.pt1check = pt1check;
	}
	public String getPt2check() {
		return pt2check;
	}
	public void setPt2check(String pt2check) {
		this.pt2check = pt2check;
	}
	public String getPt3check() {
		return pt3check;
	}
	public void setPt3check(String pt3check) {
		this.pt3check = pt3check;
	}
	
	
	

}
