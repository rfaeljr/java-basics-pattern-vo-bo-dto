package br.com.cargarage.vo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class SaleVO {
	private Long id;
	private LocalDateTime dateTimeSale;
	private BigDecimal valueTotal;
	private String payType;
	private SalesmanVO salesMan;
	private CarVO car;
	
	public SaleVO(Long id, BigDecimal valueTotal, String payType, SalesmanVO salesMan, CarVO car) {
		this.id = id;
		this.dateTimeSale = LocalDateTime.now();
		this.valueTotal = valueTotal;
		this.payType = "Cash";
		this.salesMan = salesMan;
		this.car = car;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public LocalDateTime getDateTimeSale() {
		return dateTimeSale;
	}
	
	public void setDateTimeSale(LocalDateTime dateTimeSale) {
		this.dateTimeSale = dateTimeSale;
	}
	
	public BigDecimal getValueTotal() {
		return valueTotal;
	}
	
	public void setValueTotal(BigDecimal valueTotal) {
		this.valueTotal = valueTotal;
	}
	
	public String getPayType() {
		return payType;
	}
	
	public void setPayType(String payType) {
		this.payType = payType;
	}
	
	public SalesmanVO getSalesMan() {
		return salesMan;
	}
	
	public void setSalesMan(SalesmanVO salesMan) {
		this.salesMan = salesMan;
	}
	
	public CarVO getCar() {
		return car;
	}
	
	public void setCar(CarVO car) {
		this.car = car;
	}
	
	
}
