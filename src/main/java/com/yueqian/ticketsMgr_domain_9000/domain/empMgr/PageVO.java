package com.yueqian.ticketsMgr_domain_9000.domain.empMgr;

import java.util.ArrayList;
import java.util.List;

public class PageVO <T>{
	//当前页
	private int nowPageNum = 1;
	//每页条数
	private int pageCount = 5;
	//最大页码
	private int maxPageNum;
	//总条数
	private int totalRow;
	//页码内容
	private List<T> pageList=new ArrayList<T>();
	
	
	public PageVO(int totalRow) {
		this(1,5,totalRow);
	}
	public PageVO(int nowPageNum, int pageCount, int totalRow) {
		super();
		this.nowPageNum = nowPageNum;
		this.pageCount = pageCount;
		this.totalRow = totalRow;
		//设置最大页码
		maxPageNum=this.totalRow/this.pageCount;
		if(this.totalRow % this.pageCount !=0) {
			maxPageNum++;
		}
		
		
	}
	public int getNowPageNum() {
		return nowPageNum;
	}
	public void setNowPageNum(int nowPageNum) {
		this.nowPageNum = nowPageNum;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getMaxPageNum() {
		return maxPageNum;
	}
	public void setMaxPageNum(int maxPageNum) {
		this.maxPageNum = maxPageNum;
	}
	public int getTotalRow() {
		return totalRow;
	}
	public void setTotalRow(int totalRow) {
		this.totalRow = totalRow;
	}
	public List<T> getPageList() {
		return pageList;
	}
	public void setPageList(List<T> pageList) {
		this.pageList = pageList;
	}
	
	
	
	
}
