package cn.tcmp.entity;

import lombok.Data;

/**
 * product_classification_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Product_classification_table{
	private int Product_Classification_ID;
	private String Product_Classification_Name;

	public void setProduct_Classification_ID(int Product_Classification_ID){
		this.Product_Classification_ID=Product_Classification_ID;
	}

	public int getProduct_Classification_ID(){
		return Product_Classification_ID;
	}

	public void setProduct_Classification_Name(String Product_Classification_Name){
		this.Product_Classification_Name=Product_Classification_Name;
	}

	public String getProduct_Classification_Name(){
		return Product_Classification_Name;
	}

}
