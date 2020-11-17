package com.yueqian.ticketsMgr_domain_9000.domain.tripMgr;

import java.util.Date;

public class TripVO {
	private String tripId;
	private String routeId;
	private String vehicleId;
	private String empId;
	private Date leaveTime;
	private Date returnTime;
	
	public TripVO() {
		super();
	}

	public TripVO(String tripId, String routeId, String vehicleId, String empId, Date leaveTime, Date returnTime) {
		super();
		this.tripId = tripId;
		this.routeId = routeId;
		this.vehicleId = vehicleId;
		this.empId = empId;
		this.leaveTime = leaveTime;
		this.returnTime = returnTime;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public Date getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(Date leaveTime) {
		this.leaveTime = leaveTime;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	@Override
	public String toString() {
		return "TripVO [tripId=" + tripId + ", routeId=" + routeId + ", vehicleId=" + vehicleId + ", empId=" + empId
				+ ", leaveTime=" + leaveTime + ", returnTime=" + returnTime + "]";
	}
}
