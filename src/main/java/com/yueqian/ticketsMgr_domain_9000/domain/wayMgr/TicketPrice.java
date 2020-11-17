package com.yueqian.ticketsMgr_domain_9000.domain.wayMgr;

public class TicketPrice {
	private Integer serialId;
	private Integer routeId;
	private Integer stationId;
	private Integer orderVal;
	private Integer price;
	public Integer getSerialId() {
		return serialId;
	}
	public void setSerialId(Integer serialId) {
		this.serialId = serialId;
	}
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public Integer getOrderVal() {
		return orderVal;
	}
	public void setOrderVal(Integer orderVal) {
		this.orderVal = orderVal;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "TicketPrice [serialId=" + serialId + ", routeId=" + routeId + ", stationId=" + stationId + ", orderVal="
				+ orderVal + ", price=" + price + "]";
	}
	
	

}
