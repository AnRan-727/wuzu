package cn.tcmp.entity;

import lombok.Data;

/**
 * product_list  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Product_list{
	private int Product_ID;
	private int Product_Classification_ID;
	private int Item_Type_ID;
	private int Item_ID;
	private String Product_Code;
	private String Product_Name;
	private String Product_orientation;
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

	public void setProduct_ID(int Product_ID){
		this.Product_ID=Product_ID;
	}

	public int getProduct_ID(){
		return Product_ID;
	}

	public void setProduct_Classification_ID(int Product_Classification_ID){
		this.Product_Classification_ID=Product_Classification_ID;
	}

	public int getProduct_Classification_ID(){
		return Product_Classification_ID;
	}

	public void setItem_Type_ID(int Item_Type_ID){
		this.Item_Type_ID=Item_Type_ID;
	}

	public int getItem_Type_ID(){
		return Item_Type_ID;
	}

	public void setItem_ID(int Item_ID){
		this.Item_ID=Item_ID;
	}

	public int getItem_ID(){
		return Item_ID;
	}

	public void setProduct_Code(String Product_Code){
		this.Product_Code=Product_Code;
	}

	public String getProduct_Code(){
		return Product_Code;
	}

	public void setProduct_Name(String Product_Name){
		this.Product_Name=Product_Name;
	}

	public String getProduct_Name(){
		return Product_Name;
	}

	public void setProduct_orientation(String Product_orientation){
		this.Product_orientation=Product_orientation;
	}

	public String getProduct_orientation(){
		return Product_orientation;
	}

	public void setInvestment_Consultant(String Investment_Consultant){
		this.Investment_Consultant=Investment_Consultant;
	}

	public String getInvestment_Consultant(){
		return Investment_Consultant;
	}

	public void setDistribution_channel(String Distribution_channel){
		this.Distribution_channel=Distribution_channel;
	}

	public String getDistribution_channel(){
		return Distribution_channel;
	}

	public void setStructure_type(String structure_type){
		this.structure_type=structure_type;
	}

	public String getStructure_type(){
		return structure_type;
	}

	public void setContract_prefix(String Contract_prefix){
		this.Contract_prefix=Contract_prefix;
	}

	public String getContract_prefix(){
		return Contract_prefix;
	}

	public void setProduct_Risk_Level(String Product_Risk_Level){
		this.Product_Risk_Level=Product_Risk_Level;
	}

	public String getProduct_Risk_Level(){
		return Product_Risk_Level;
	}

	public void setSuitable_for_Customer_Risk_Level(String Suitable_for_Customer_Risk_Level){
		this.Suitable_for_Customer_Risk_Level=Suitable_for_Customer_Risk_Level;
	}

	public String getSuitable_for_Customer_Risk_Level(){
		return Suitable_for_Customer_Risk_Level;
	}

	public void setProduct_Description(String Product_Description){
		this.Product_Description=Product_Description;
	}

	public String getProduct_Description(){
		return Product_Description;
	}

	public void setRemarks(String Remarks){
		this.Remarks=Remarks;
	}

	public String getRemarks(){
		return Remarks;
	}

	public void setIncome_type(String Income_type){
		this.Income_type=Income_type;
	}

	public String getIncome_type(){
		return Income_type;
	}

	public void setIncome_distribution_cycle(String Income_distribution_cycle){
		this.Income_distribution_cycle=Income_distribution_cycle;
	}

	public String getIncome_distribution_cycle(){
		return Income_distribution_cycle;
	}

	public void setProfit_Distribution_Description(String Profit_Distribution_Description){
		this.Profit_Distribution_Description=Profit_Distribution_Description;
	}

	public String getProfit_Distribution_Description(){
		return Profit_Distribution_Description;
	}

	public void setOpen_cycle(String Open_cycle){
		this.Open_cycle=Open_cycle;
	}

	public String getOpen_cycle(){
		return Open_cycle;
	}

	public void setOpen_Period_Description(String Open_Period_Description){
		this.Open_Period_Description=Open_Period_Description;
	}

	public String getOpen_Period_Description(){
		return Open_Period_Description;
	}

	public void setClosure_period(String Closure_period){
		this.Closure_period=Closure_period;
	}

	public String getClosure_period(){
		return Closure_period;
	}

	public void setClosed_period_unit(String Closed_period_unit){
		this.Closed_period_unit=Closed_period_unit;
	}

	public String getClosed_period_unit(){
		return Closed_period_unit;
	}

	public void setIs_it_redeemable(String Is_it_redeemable){
		this.Is_it_redeemable=Is_it_redeemable;
	}

	public String getIs_it_redeemable(){
		return Is_it_redeemable;
	}

	public void setRedemption_Rate(String Redemption_Rate){
		this.Redemption_Rate=Redemption_Rate;
	}

	public String getRedemption_Rate(){
		return Redemption_Rate;
	}

	public void setRedemption_Restriction(String Redemption_Restriction){
		this.Redemption_Restriction=Redemption_Restriction;
	}

	public String getRedemption_Restriction(){
		return Redemption_Restriction;
	}

	public void setIs_Addition_Permissible(String Is_Addition_Permissible){
		this.Is_Addition_Permissible=Is_Addition_Permissible;
	}

	public String getIs_Addition_Permissible(){
		return Is_Addition_Permissible;
	}

	public void setOperations_Manager_A(int Operations_Manager_A){
		this.Operations_Manager_A=Operations_Manager_A;
	}

	public int getOperations_Manager_A(){
		return Operations_Manager_A;
	}

	public void setOperations_Manager_B(int Operations_Manager_B){
		this.Operations_Manager_B=Operations_Manager_B;
	}

	public int getOperations_Manager_B(){
		return Operations_Manager_B;
	}

}
