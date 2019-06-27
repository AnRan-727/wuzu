package cn.tcmp.entity;

import lombok.Data;

/**
 * product_investment  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Product_investment{
	private int Products_To_Id;
	private String Products_To_Name;

	public void setProducts_To_Id(int Products_To_Id){
		this.Products_To_Id=Products_To_Id;
	}

	public int getProducts_To_Id(){
		return Products_To_Id;
	}

	public void setProducts_To_Name(String Products_To_Name){
		this.Products_To_Name=Products_To_Name;
	}

	public String getProducts_To_Name(){
		return Products_To_Name;
	}

}
