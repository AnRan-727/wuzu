package cn.tcmp.entity;

import lombok.Data;

/**
 * item_type_table  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Item_type_table{
	private int Item_Type_ID;
	private String Item_Type_Name;

	public void setItem_Type_ID(int Item_Type_ID){
		this.Item_Type_ID=Item_Type_ID;
	}

	public int getItem_Type_ID(){
		return Item_Type_ID;
	}

	public void setItem_Type_Name(String Item_Type_Name){
		this.Item_Type_Name=Item_Type_Name;
	}

	public String getItem_Type_Name(){
		return Item_Type_Name;
	}

}
