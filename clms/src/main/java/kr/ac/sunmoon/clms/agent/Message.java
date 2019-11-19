package kr.ac.sunmoon.clms.agent;

import java.io.Serializable;

public class Message implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String ip;
	private String cpu;
	private String vga;
	private String ram;
	private String storage;
	
	@Override
	public String toString() {
		return "Message [username=" + username + ", ip=" + ip + ", cpu=" + cpu + ", vga=" + vga + ", ram=" + ram
				+ ", storage=" + storage + "]";
	}

	public Message() {
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	public String getVga() {
		return vga;
	}
	public void setVga(String vga) {
		this.vga = vga;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
}
