package com.screen.employee;

public class EmployeeVO {
	/*
	 * CREATE TABLE KOR1.EMPLOYEE (
	      EMP_NO NUMBER(10 , 0) NOT NULL,
	      EMP_NAME VARCHAR2(50) NOT NULL,
	      EMP_ID VARCHAR2(50) NOT NULL,
	      EMP_PW VARCHAR2(50) NOT NULL,
	      EMP_TYPE NUMBER(1 , 0) NOT NULL
	   );
	 */
	
	private int empNo; //�����ȣ
	private String empName; // ����̸�
	private String empId; // ��� id
	private String empPw; // ��� pw
	private int empType; // ��� ��å
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpPw() {
		return empPw;
	}
	public void setEmpPw(String empPw) {
		this.empPw = empPw;
	}
	public int getEmpType() {
		return empType;
	}
	public void setEmpType(int empType) {
		this.empType = empType;
	}
	
	

}
