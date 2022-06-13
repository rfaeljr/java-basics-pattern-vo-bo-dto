package br.com.cargarage.bo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.cargarage.vo.CarModelVO;
import br.com.cargarage.vo.CarVO;
import br.com.cargarage.vo.SaleVO;
import br.com.cargarage.vo.SalesmanVO;

public class SalesBO {
	List<SaleVO> listSales;
	
	public SalesBO() {
		listSales = new ArrayList<SaleVO>();
	}
	
	public List<SaleVO> getListAllSales(){
		return this.listSales;
	}
	
	@SuppressWarnings("finally")
	public boolean insertSalesVO(CarModelVO carModelVO, CarVO carVO, SalesmanVO salesManVO) {
		boolean flag = false;
		
		try {
			SaleVO saleVo = new SaleVO(2L, new BigDecimal("90099.99"), "Debit Card", salesManVO, carVO);
			this.listSales.add(saleVo);
			flag = true;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			return flag;
		}
		
	}
}
