package com.yueqian.ticketsMgr_domain_9000.domain.wayMgr;

public class RouteInfo {
	private Integer routeId;
	private Integer startStation;
	private Integer terminalStation;
	private String routeName;
	private Double price;
	private Integer delMark;
	private Station startS;
	private Station terminalS;
	
	public Station getStartS() {
		return startS;
	}
	public void setStartS(Station startS) {
		this.startS = startS;
	}
	public Station getTerminalS() {
		return terminalS;
	}
	public void setTerminalS(Station terminalS) {
		this.terminalS = terminalS;
	}
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public Integer getStartStation() {
		return startStation;
	}
	public void setStartStation(Integer startStation) {
		this.startStation = startStation;
	}
	public Integer getTerminalStation() {
		return terminalStation;
	}
	public void setTerminalStation(Integer terminalStation) {
		this.terminalStation = terminalStation;
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
	@Override
	public String toString() {
		return "RouteInfo [routeId=" + routeId + ", startStation=" + startStation + ", terminalStation="
				+ terminalStation + ", routeName=" + routeName + ", price=" + price + ", delMark=" + delMark + "]";
	}
	
	
}