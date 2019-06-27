package cn.tcmp.entity;

import lombok.Data;

/**
 * product_list  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 产品表
 * */
public class Product_list{
	private int Product_ID;
	private Product_classification_table Product_Classification_ID;//产品分类ID
	private Item_sheet Item_ID;//项目ID
	private String Product_Code;
	private String Product_Name;
	private Product_investment Products_To_Id;//产品投向ID
	private String Investment_Consultant;
	private String Distribution_channel;
	private String structure_type;
	private String Contract_prefix;
	private String Product_Risk_Level;
	private String Suitable_for_Customer_Risk_Level;
	private String Product_Description;
	private String Remarks;
	private String Income_type;
	private String Income_distribution_cycle;
	private String Profit_Distribution_Description;
	private String Open_cycle;
	private String Open_Period_Description;
	private String Closure_period;
	private String Closed_period_unit;
	private String Is_it_redeemable;
	private String Redemption_Rate;
	private String Redemption_Restriction;
	private String Is_Addition_Permissible;
	private int Operations_Manager_A;
	private int Operations_Manager_B;



}
