package com.yueqian.ticketsMgr_domain_9000.domain.empMgr;

import java.util.Date;

import com.yueqian.ticketsMgr_domain_9000.domain.sysMgr.RolesVO;

public class EmpVO {
	private Integer empId;//
	private String account;
	private String pwd;//
	private String realName;
	private String sex;
	private String nationality;
	private String idCardNum;
	private Date dob;
	private Date hireDate;
	private String address;
	private String telephone;
	private RolesVO role;
	private String delFlag;//
	
	
	
	public EmpVO() {
		super();
	}
	public EmpVO(Integer empId, String account, String pwd, String realName, String sex, String nationality,
			String idCardNum, Date dob, Date hireDate, String address, String telephone, RolesVO role, String delFlag) {
		super();
		this.empId = empId;
		this.account = account;
		this.pwd = pwd;
		this.realName = realName;
		this.sex = sex;
		this.nationality = nationality;
		this.idCardNum = idCardNum;
		this.dob = dob;
		this.hireDate = hireDate;
		this.address = address;
		this.telephone = telephone;
		this.role = role;
		this.delFlag = delFlag;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getIdCardNum() {
		return idCardNum;
	}
	public void setIdCardNum(String idCardNum) {
		this.idCardNum = idCardNum;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public RolesVO getRole() {
		return role;
	}
	public void setRole(RolesVO role) {
		this.role = role;
	}
	public String getDelFlag() {
		return delFlag;
	}
	public void setDelFlag(String delFlag) {
		this.delFlag = delFlag;
	}
	@Override
	public String toString() {
		return "EmpVO [empId=" + empId + ", account=" + account + ", pwd=" + pwd + ", realName=" + realName + ", sex="
				+ sex + ", nationality=" + nationality + ", idCardNum=" + idCardNum + ", dob=" + dob + ", hireDate="
				+ hireDate + ", address=" + address + ", telephone=" + telephone + ", role=" + role + ", delFlag="
				+ delFlag + "]";
	}
	
	
}
