package cn.tcmp.entity;
import lombok.Data;

import java.util.Date;

/**
 * item_sheet  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Item_sheet{
	private int Item_ID;
	private String Entry_name;
	private int Item_type_ID;
	private String English_name;
	private String Project_code;
	private int Project_size_lowercase;
	private String Project_size_capitalization;
	private int Project_duration;
	private String Term_Unit;
	private Date Date_of_establishment;
	private Date Maturity_Date;
	private String Financers;
	private int Product_classification_ID;
	private int Channel_table_ID;
	private String Source_docker_A;
	private String Source_docker_B;
	private String Source_docker_C;
	private int Product_Manager_A;
	private int Product_Manager_B;
	private String Custody_account;
	private String Custodian_bank;
	private String Custodial_household_name;
	private String Raising_Account;
	private String Collecting_household_names;
	private String Raising_Bank;
	private String Notes;

	public void setItem_ID(int Item_ID){
		this.Item_ID=Item_ID;
	}

	public int getItem_ID(){
		return Item_ID;
	}

	public void setEntry_name(String Entry_name){
		this.Entry_name=Entry_name;
	}

	public String getEntry_name(){
		return Entry_name;
	}

	public void setItem_type_ID(int Item_type_ID){
		this.Item_type_ID=Item_type_ID;
	}

	public int getItem_type_ID(){
		return Item_type_ID;
	}

	public void setEnglish_name(String English_name){
		this.English_name=English_name;
	}

	public String getEnglish_name(){
		return English_name;
	}

	public void setProject_code(String Project_code){
		this.Project_code=Project_code;
	}

	public String getProject_code(){
		return Project_code;
	}

	public void setProject_size_lowercase(int Project_size_lowercase){
		this.Project_size_lowercase=Project_size_lowercase;
	}

	public int getProject_size_lowercase(){
		return Project_size_lowercase;
	}

	public void setProject_size_capitalization(String Project_size_capitalization){
		this.Project_size_capitalization=Project_size_capitalization;
	}

	public String getProject_size_capitalization(){
		return Project_size_capitalization;
	}

	public void setProject_duration(int Project_duration){
		this.Project_duration=Project_duration;
	}

	public int getProject_duration(){
		return Project_duration;
	}

	public void setTerm_Unit(String Term_Unit){
		this.Term_Unit=Term_Unit;
	}

	public String getTerm_Unit(){
		return Term_Unit;
	}

	public void setDate_of_establishment(Date Date_of_establishment){
		this.Date_of_establishment=Date_of_establishment;
	}

	public Date getDate_of_establishment(){
		return Date_of_establishment;
	}

	public void setMaturity_Date(Date Maturity_Date){
		this.Maturity_Date=Maturity_Date;
	}

	public Date getMaturity_Date(){
		return Maturity_Date;
	}

	public void setFinancers(String Financers){
		this.Financers=Financers;
	}

	public String getFinancers(){
		return Financers;
	}

	public void setProduct_classification_ID(int Product_classification_ID){
		this.Product_classification_ID=Product_classification_ID;
	}

	public int getProduct_classification_ID(){
		return Product_classification_ID;
	}

	public void setChannel_table_ID(int Channel_table_ID){
		this.Channel_table_ID=Channel_table_ID;
	}

	public int getChannel_table_ID(){
		return Channel_table_ID;
	}

	public void setSource_docker_A(String Source_docker_A){
		this.Source_docker_A=Source_docker_A;
	}

	public String getSource_docker_A(){
		return Source_docker_A;
	}

	public void setSource_docker_B(String Source_docker_B){
		this.Source_docker_B=Source_docker_B;
	}

	public String getSource_docker_B(){
		return Source_docker_B;
	}

	public void setSource_docker_C(String Source_docker_C){
		this.Source_docker_C=Source_docker_C;
	}

	public String getSource_docker_C(){
		return Source_docker_C;
	}

	public void setProduct_Manager_A(int Product_Manager_A){
		this.Product_Manager_A=Product_Manager_A;
	}

	public int getProduct_Manager_A(){
		return Product_Manager_A;
	}

	public void setProduct_Manager_B(int Product_Manager_B){
		this.Product_Manager_B=Product_Manager_B;
	}

	public int getProduct_Manager_B(){
		return Product_Manager_B;
	}

	public void setCustody_account(String Custody_account){
		this.Custody_account=Custody_account;
	}

	public String getCustody_account(){
		return Custody_account;
	}

	public void setCustodian_bank(String Custodian_bank){
		this.Custodian_bank=Custodian_bank;
	}

	public String getCustodian_bank(){
		return Custodian_bank;
	}

	public void setCustodial_household_name(String Custodial_household_name){
		this.Custodial_household_name=Custodial_household_name;
	}

	public String getCustodial_household_name(){
		return Custodial_household_name;
	}

	public void setRaising_Account(String Raising_Account){
		this.Raising_Account=Raising_Account;
	}

	public String getRaising_Account(){
		return Raising_Account;
	}

	public void setCollecting_household_names(String Collecting_household_names){
		this.Collecting_household_names=Collecting_household_names;
	}

	public String getCollecting_household_names(){
		return Collecting_household_names;
	}

	public void setRaising_Bank(String Raising_Bank){
		this.Raising_Bank=Raising_Bank;
	}

	public String getRaising_Bank(){
		return Raising_Bank;
	}

	public void setNotes(String Notes){
		this.Notes=Notes;
	}

	public String getNotes(){
		return Notes;
	}

}
