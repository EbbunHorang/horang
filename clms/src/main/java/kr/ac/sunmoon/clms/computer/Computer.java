package kr.ac.sunmoon.clms.computer;

import java.io.Serializable;
import java.sql.Date;

public class Computer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int no;
	private int laboratoryNo;
	private String name;
	private String ipAddress;
	private Date specRegDate;
	private String cpu;
	private String ram;
	private String vga;
	private String ssd;
	private String hdd;
	
	public int getNo() {
		return no;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	
	public int getLaboratoryNo() {
		return laboratoryNo;
	}
	
	public void setLaboratoryNo(int laboratoryNo) {
		this.laboratoryNo = laboratoryNo;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}
	
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	
	public Date getSpecRegDate() {
		return specRegDate;
	}
	
	public void setSpecRegDate(Date specRegDate) {
		this.specRegDate = specRegDate;
	}
	
	public String getCpu() {
		return cpu;
	}
	
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	
	public String getRam() {
		return ram;
	}
	
	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String getVga() {
		return vga;
	}
	
	public void setVga(String vga) {
		this.vga = vga;
	}
	
	public String getSsd() {
		return ssd;
	}
	
	public void setSsd(String ssd) {
		this.ssd = ssd;
	}
	
	public String getHdd() {
		return hdd;
	}
	
	public void setHdd(String hdd) {
		this.hdd = hdd;
	}
}
