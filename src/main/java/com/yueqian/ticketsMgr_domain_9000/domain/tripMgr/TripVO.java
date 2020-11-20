package com.yueqian.ticketsMgr_domain_9000.domain.tripMgr;

import java.util.Date;

import com.yueqian.ticketsMgr_domain_9000.domain.empMgr.EmpVO;
import com.yueqian.ticketsMgr_domain_9000.domain.sysMgr.CarVO;
import com.yueqian.ticketsMgr_domain_9000.domain.wayMgr.RouteInfo;

public class TripVO {
	private String tripId;
	private RouteInfo route;
	private CarVO car;
	private EmpVO emp;
	private Date leaveTime;
	private Date returnTime;
	
	public TripVO() {
		super();
	}

	public TripVO(String tripId, Date leaveTime, Date returnTime) {
		super();
		this.tripId = tripId;
		this.leaveTime = leaveTime;
		this.returnTime = returnTime;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}


	public RouteInfo getRoute() {
		return route;
	}

	public void setRoute(RouteInfo route) {
		this.route = route;
	}

	public CarVO getCar() {
		return car;
	}

	public void setCar(CarVO car) {
		this.car = car;
	}

	public EmpVO getEmp() {
		return emp;
	}

	public void setEmp(EmpVO emp) {
		this.emp = emp;
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
		return "TripVO [tripId=" + tripId + ", route=" + route + ", car=" + car + ", emp=" + emp + ", leaveTime="
				+ leaveTime + ", returnTime=" + returnTime + "]";
	}


	
	
}
