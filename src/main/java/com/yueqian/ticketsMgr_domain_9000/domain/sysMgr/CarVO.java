package com.yueqian.ticketsMgr_domain_9000.domain.sysMgr;

import java.math.BigDecimal;
import java.util.Date;

public class CarVO {
	private int vehicleId;
	private String vehicleNum;
	private Date buyDate;
	private String brand;
	private String model;
	private int maxCarry;
	private BigDecimal displacement;
	private String engineNumber;
	private int delMark;
	
	public CarVO() {
		super();
	}
	
	
	
	public CarVO(int vehicleId, String vehicleNum, Date buyDate, String brand, String model, int maxCarry,
			BigDecimal displacement, String engineNumber, int delMark) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleNum = vehicleNum;
		this.buyDate = buyDate;
		this.brand = brand;
		this.model = model;
		this.maxCarry = maxCarry;
		this.displacement = displacement;
		this.engineNumber = engineNumber;
		this.delMark = delMark;
	}



	public int getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}
	public String getVehicleNum() {
		return vehicleNum;
	}
	public void setVehicleNum(String vehicleNum) {
		this.vehicleNum = vehicleNum;
	}
	public Date getBuyDate() {
		return buyDate;
	}
	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxCarry() {
		return maxCarry;
	}
	public void setMaxCarry(int maxCarry) {
		this.maxCarry = maxCarry;
	}
	public BigDecimal getDisplacement() {
		return displacement;
	}
	public void setDisplacement(BigDecimal displacement) {
		this.displacement = displacement;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public int getDelMark() {
		return delMark;
	}
	public void setDelMark(int delMark) {
		this.delMark = delMark;
	}
	@Override
	public String toString() {
		return "car [vehicleId=" + vehicleId + ", vehicleNum=" + vehicleNum + ", buyDate=" + buyDate + ", brand="
				+ brand + ", model=" + model + ", maxCarry=" + maxCarry + ", displacement=" + displacement
				+ ", engineNumber=" + engineNumber + ", delMark=" + delMark + "]";
	}
	
}
