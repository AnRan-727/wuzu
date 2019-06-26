package cn.tcmp.entity;

import lombok.Data;

/**
 * distribution_of_income  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Distribution_of_income{
	private int Income_Distribution_ID;
	private String Income_Distribution_Name;

	public void setIncome_Distribution_ID(int Income_Distribution_ID){
		this.Income_Distribution_ID=Income_Distribution_ID;
	}

	public int getIncome_Distribution_ID(){
		return Income_Distribution_ID;
	}

	public void setIncome_Distribution_Name(String Income_Distribution_Name){
		this.Income_Distribution_Name=Income_Distribution_Name;
	}

	public String getIncome_Distribution_Name(){
		return Income_Distribution_Name;
	}

}
