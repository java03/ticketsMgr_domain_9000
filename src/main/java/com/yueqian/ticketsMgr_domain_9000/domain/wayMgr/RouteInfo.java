package com.yueqian.ticketsMgr_domain_9000.domain.wayMgr;

public class RouteInfo {
	private Integer routeId;
	private Station startStation;
	private Station terminalStation;
	private String routeName;
	private Double price;
	private Integer delMark;
	
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getDelMark() {
		return delMark;
	}
	public void setDelMark(Integer delMark) {
		this.delMark = delMark;
	}
	
	public Station getStartStation() {
		return startStation;
	}
	public void setStartStation(Station startStation) {
		this.startStation = startStation;
	}
	public Station getTerminalStation() {
		return terminalStation;
	}
	public void setTerminalStation(Station terminalStation) {
		this.terminalStation = terminalStation;
	}
	@Override
	public String toString() {
		return "RouteInfo [routeId=" + routeId + ", startStation=" + startStation + ", terminalStation="
				+ terminalStation + ", routeName=" + routeName + ", price=" + price + ", delMark=" + delMark + "]";
	}
	
	
	
}