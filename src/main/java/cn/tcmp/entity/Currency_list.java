package cn.tcmp.entity;

import lombok.Data;

/**
 * currency_list  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Currency_list{
	private int Currency_ID;
	private String Currency_Name;

	public void setCurrency_ID(int Currency_ID){
		this.Currency_ID=Currency_ID;
	}

	public int getCurrency_ID(){
		return Currency_ID;
	}

	public void setCurrency_Name(String Currency_Name){
		this.Currency_Name=Currency_Name;
	}

	public String getCurrency_Name(){
		return Currency_Name;
	}

}
