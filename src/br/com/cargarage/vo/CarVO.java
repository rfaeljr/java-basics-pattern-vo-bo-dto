package br.com.cargarage.vo;

public class CarVO {
	private Long id;
	private String chassis;
	private String color;
	private Short year;
	private String describe;
	private CarModelVO carModel;
	private static short totalCars;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChassis() {
		return chassis;
	}
	public void setChassis(String chassis) {
		this.chassis = chassis;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Short getYear() {
		return year;
	}
	public void setYear(Short year) {
		this.year = year;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public CarModelVO getCarModel() {
		return carModel;
	}
	public void setCarModel(CarModelVO carModel) {
		this.carModel = carModel;
	}
	public static short getTotalCars() {
		return totalCars;
	}
	
	public CarVO(	Long id, String chassis, String color, Short year, String describe, CarModelVO carModel) {
		this.id = id; 
		this.chassis = chassis; 
		this.color = color; 
		this.year = year; 
		this.describe = describe; 
		this.carModel = carModel;
		totalCars++;
	}
	
}
