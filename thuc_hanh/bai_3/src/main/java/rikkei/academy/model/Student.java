package rikkei.academy.model;

public class Student {
	private int id;
	private String name;
	private String address;
	private boolean status;
	
	public Student() {
	}
	
	public Student(int id, String name, String address, boolean status) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.status = status;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
}
