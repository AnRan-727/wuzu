package cn.tcmp.entity;
import lombok.Data;

import java.util.Date;
import java.sql.*;

/**
 * net_value_table  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Net_value_table{
	private int Net_Worth_ID;
	private int Product_ID;
	private int Income_Type_ID;
	private String Set_Up_Batch;
	private String Net_Worth;
	private String Cumulative_Net_Worth;
	private String Extremely_Profitable;
	private String Rate_Of_Return;
	private Date Valuation_Date;
	private Date Date_Of_Publication;
	private int Operator_ID;
	private Timestamp Operating_Date;

	public void setNet_Worth_ID(int Net_Worth_ID){
		this.Net_Worth_ID=Net_Worth_ID;
	}

	public int getNet_Worth_ID(){
		return Net_Worth_ID;
	}

	public void setProduct_ID(int Product_ID){
		this.Product_ID=Product_ID;
	}

	public int getProduct_ID(){
		return Product_ID;
	}

	public void setIncome_Type_ID(int Income_Type_ID){
		this.Income_Type_ID=Income_Type_ID;
	}

	public int getIncome_Type_ID(){
		return Income_Type_ID;
	}

	public void setSet_Up_Batch(String Set_Up_Batch){
		this.Set_Up_Batch=Set_Up_Batch;
	}

	public String getSet_Up_Batch(){
		return Set_Up_Batch;
	}

	public void setNet_Worth(String Net_Worth){
		this.Net_Worth=Net_Worth;
	}

	public String getNet_Worth(){
		return Net_Worth;
	}

	public void setCumulative_Net_Worth(String Cumulative_Net_Worth){
		this.Cumulative_Net_Worth=Cumulative_Net_Worth;
	}

	public String getCumulative_Net_Worth(){
		return Cumulative_Net_Worth;
	}

	public void setExtremely_Profitable(String Extremely_Profitable){
		this.Extremely_Profitable=Extremely_Profitable;
	}

	public String getExtremely_Profitable(){
		return Extremely_Profitable;
	}

	public void setRate_Of_Return(String Rate_Of_Return){
		this.Rate_Of_Return=Rate_Of_Return;
	}

	public String getRate_Of_Return(){
		return Rate_Of_Return;
	}

	public void setValuation_Date(Date Valuation_Date){
		this.Valuation_Date=Valuation_Date;
	}

	public Date getValuation_Date(){
		return Valuation_Date;
	}

	public void setDate_Of_Publication(Date Date_Of_Publication){
		this.Date_Of_Publication=Date_Of_Publication;
	}

	public Date getDate_Of_Publication(){
		return Date_Of_Publication;
	}

	public void setOperator_ID(int Operator_ID){
		this.Operator_ID=Operator_ID;
	}

	public int getOperator_ID(){
		return Operator_ID;
	}

	public void setOperating_Date(Timestamp Operating_Date){
		this.Operating_Date=Operating_Date;
	}

	public Timestamp getOperating_Date(){
		return Operating_Date;
	}

}
