package cn.tcmp.entity;

import lombok.Data;

/**
 * investments_schedule  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Investments_schedule{
	private int Investment_Mode_ID;
	private String Investment_Mode_Name;

	public void setInvestment_Mode_ID(int Investment_Mode_ID){
		this.Investment_Mode_ID=Investment_Mode_ID;
	}

	public int getInvestment_Mode_ID(){
		return Investment_Mode_ID;
	}

	public void setInvestment_Mode_Name(String Investment_Mode_Name){
		this.Investment_Mode_Name=Investment_Mode_Name;
	}

	public String getInvestment_Mode_Name(){
		return Investment_Mode_Name;
	}

}
