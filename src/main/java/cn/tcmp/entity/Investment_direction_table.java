package cn.tcmp.entity;

import lombok.Data;

/**
 * investment_direction_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Investment_direction_table{
	private int Investment_Direction_ID;
	private String nvestment_Direction_Name;

	public void setInvestment_Direction_ID(int Investment_Direction_ID){
		this.Investment_Direction_ID=Investment_Direction_ID;
	}

	public int getInvestment_Direction_ID(){
		return Investment_Direction_ID;
	}

	public void setNvestment_Direction_Name(String nvestment_Direction_Name){
		this.nvestment_Direction_Name=nvestment_Direction_Name;
	}

	public String getNvestment_Direction_Name(){
		return nvestment_Direction_Name;
	}

}
