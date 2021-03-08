package com.callor.iolist.model;

public class IolistVO {

	private String date;
	private String pName;
	private String dName;
	private String cName;
	private int num;
	private int iPrice;
	private int oPrice;
	private int qty;
	
	public IolistVO() {
	}
	
	public IolistVO(String date, String pName, String dName, String cName, int num, int iPrice, int oPrice, int qty) {
		super();
		this.date = date;
		this.pName = pName;
		this.dName = dName;
		this.cName = cName;
		this.num = num;
		this.iPrice = iPrice;
		this.oPrice = oPrice;
		this.qty = qty;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getiPrice() {
		return iPrice;
	}
	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}
	public int getoPrice() {
		return oPrice;
	}
	public void setoPrice(int oPrice) {
		this.oPrice = oPrice;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "IolistVO [date=" + date + ", pName=" + pName + ", dName=" + dName + ", cName=" + cName + ", num=" + num
				+ ", iPrice=" + iPrice + ", oPrice=" + oPrice + ", qty=" + qty + "]";
	}
	
	
	
}
