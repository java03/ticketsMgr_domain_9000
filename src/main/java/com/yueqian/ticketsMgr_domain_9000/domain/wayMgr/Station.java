package com.yueqian.ticketsMgr_domain_9000.domain.wayMgr;

public class Station {
	private Integer stationId;
	private String stationCode;
	private String stationName;
	private Integer distance;
	public Integer getStationId() {
		return stationId;
	}
	public void setStationId(Integer stationId) {
		this.stationId = stationId;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public Integer getDistance() {
		return distance;
	}
	public void setDistance(Integer distance) {
		this.distance = distance;
	}
	@Override
	public String toString() {
		return "Station [stationId=" + stationId + ", stationCode=" + stationCode + ", stationName=" + stationName
				+ ", distance=" + distance + "]";
	}
	
}
