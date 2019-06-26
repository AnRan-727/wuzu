package cn.tcmp.entity;

import lombok.Data;

/**
 * income_type_statement  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Income_type_statement{
	private int Income_Type_ID;
	private String Income_Type_Name;

	public void setIncome_Type_ID(int Income_Type_ID){
		this.Income_Type_ID=Income_Type_ID;
	}

	public int getIncome_Type_ID(){
		return Income_Type_ID;
	}

	public void setIncome_Type_Name(String Income_Type_Name){
		this.Income_Type_Name=Income_Type_Name;
	}

	public String getIncome_Type_Name(){
		return Income_Type_Name;
	}

}
