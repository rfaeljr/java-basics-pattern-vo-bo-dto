package br.com.cargarage.dto;

import java.math.BigDecimal;

import br.com.cargarage.bo.SalesBO;
import br.com.cargarage.vo.CarModelVO;
import br.com.cargarage.vo.CarVO;
import br.com.cargarage.vo.SaleVO;
import br.com.cargarage.vo.SalesmanVO;

public class SalesDTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarModelVO carModelVO = new CarModelVO();
		carModelVO.setFuel("Gasoline");
		carModelVO.setInjection("Direct multi point");
		carModelVO.setMotorPoint("2.0");
		carModelVO.setTransmission("Turbo");
		carModelVO.setVendor("Ford");
		carModelVO.setWeight(1200.88D);
		
		CarVO carVO = new CarVO(1L, "87YTG990", "Piano Black", Short.parseShort("2021"), "Mustang Big Car Model", carModelVO);
		
		SalesmanVO salesManVO = new SalesmanVO();
		salesManVO.setId(99L);
		salesManVO.setName("Rafael Costa");
		salesManVO.setAge( (short)38);
		salesManVO.setOffice("Car Sales Man II");
		
		SalesBO salesBO = new SalesBO();
		//repeat inserts
		salesBO.insertSalesVO(carModelVO, carVO, salesManVO);
		salesBO.insertSalesVO(carModelVO, carVO, salesManVO);
		
		for( SaleVO salesVO : salesBO.getListAllSales() ) {
			System.out.println( salesVO );
		}
		
		
	}

}
