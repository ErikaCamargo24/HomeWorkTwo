package model;

public class Vehicle {
	
	private String brand;
	private String model;
	private int year;
	private String license;
	private String color;
	private int id;
	
	public Vehicle(String brand, String model, int year, String license, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.license = license;
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
}
