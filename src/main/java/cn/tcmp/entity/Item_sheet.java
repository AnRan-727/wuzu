package cn.tcmp.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * item_sheet  generated at 2019-06-27 15:55:25 by: eric
 */
@AllArgsConstructor
@NoArgsConstructor
/**
 * 项目表
 * */
public class Item_sheet{
	private int Item_ID;
	private String Entry_name;
	private Item_type_table Item_type_ID;//项目类型ID
	private String English_name;
	private String Project_code;
	private int Project_size_lowercase;
	private String Project_size_capitalization;
	private int Project_duration;
	private String Term_Unit;
	private String Date_of_establishment;
	private String Maturity_Date;
	private String Financers;
	private Product_classification_table Product_classification_ID;//产品分类ID
	private Channel_list Channel_table_ID;//渠道表ID
	private String Source_docker_A;//来源方对接人a
	private String Source_docker_B;//来源方对接人b
	private String Source_docker_C;//来源方对接人c
	private int Product_Manager_A;//产品经理A
	private int Product_Manager_B;//产品经理B
	private String Custody_account;
	private String Custodian_bank;
	private String Custodial_household_name;
	private String Raising_Account;
	private String Collecting_household_names;
	private String Raising_Bank;
	private String Notes;

	public int getItem_ID() {
		return Item_ID;
	}

	public void setItem_ID(int item_ID) {
		Item_ID = item_ID;
	}

	public String getEntry_name() {
		return Entry_name;
	}

	public void setEntry_name(String entry_name) {
		Entry_name = entry_name;
	}

	public Item_type_table getItem_type_ID() {
		return Item_type_ID;
	}

	public void setItem_type_ID(Item_type_table item_type_ID) {
		Item_type_ID = item_type_ID;
	}

	public String getEnglish_name() {
		return English_name;
	}

	public void setEnglish_name(String english_name) {
		English_name = english_name;
	}

	public String getProject_code() {
		return Project_code;
	}

	public void setProject_code(String project_code) {
		Project_code = project_code;
	}

	public int getProject_size_lowercase() {
		return Project_size_lowercase;
	}

	public void setProject_size_lowercase(int project_size_lowercase) {
		Project_size_lowercase = project_size_lowercase;
	}

	public String getProject_size_capitalization() {
		return Project_size_capitalization;
	}

	public void setProject_size_capitalization(String project_size_capitalization) {
		Project_size_capitalization = project_size_capitalization;
	}

	public int getProject_duration() {
		return Project_duration;
	}

	public void setProject_duration(int project_duration) {
		Project_duration = project_duration;
	}

	public String getTerm_Unit() {
		return Term_Unit;
	}

	public void setTerm_Unit(String term_Unit) {
		Term_Unit = term_Unit;
	}

	public String getDate_of_establishment() {
		return Date_of_establishment;
	}

	public void setDate_of_establishment(String date_of_establishment) {
		Date_of_establishment = date_of_establishment;
	}

	public String getMaturity_Date() {
		return Maturity_Date;
	}

	public void setMaturity_Date(String maturity_Date) {
		Maturity_Date = maturity_Date;
	}

	public String getFinancers() {
		return Financers;
	}

	public void setFinancers(String financers) {
		Financers = financers;
	}

	public Product_classification_table getProduct_classification_ID() {
		return Product_classification_ID;
	}

	public void setProduct_classification_ID(Product_classification_table product_classification_ID) {
		Product_classification_ID = product_classification_ID;
	}

	public Channel_list getChannel_table_ID() {
		return Channel_table_ID;
	}

	public void setChannel_table_ID(Channel_list channel_table_ID) {
		Channel_table_ID = channel_table_ID;
	}

	public String getSource_docker_A() {
		return Source_docker_A;
	}

	public void setSource_docker_A(String source_docker_A) {
		Source_docker_A = source_docker_A;
	}

	public String getSource_docker_B() {
		return Source_docker_B;
	}

	public void setSource_docker_B(String source_docker_B) {
		Source_docker_B = source_docker_B;
	}

	public String getSource_docker_C() {
		return Source_docker_C;
	}

	public void setSource_docker_C(String source_docker_C) {
		Source_docker_C = source_docker_C;
	}

	public int getProduct_Manager_A() {
		return Product_Manager_A;
	}

	public void setProduct_Manager_A(int product_Manager_A) {
		Product_Manager_A = product_Manager_A;
	}

	public int getProduct_Manager_B() {
		return Product_Manager_B;
	}

	public void setProduct_Manager_B(int product_Manager_B) {
		Product_Manager_B = product_Manager_B;
	}

	public String getCustody_account() {
		return Custody_account;
	}

	public void setCustody_account(String custody_account) {
		Custody_account = custody_account;
	}

	public String getCustodian_bank() {
		return Custodian_bank;
	}

	public void setCustodian_bank(String custodian_bank) {
		Custodian_bank = custodian_bank;
	}

	public String getCustodial_household_name() {
		return Custodial_household_name;
	}

	public void setCustodial_household_name(String custodial_household_name) {
		Custodial_household_name = custodial_household_name;
	}

	public String getRaising_Account() {
		return Raising_Account;
	}

	public void setRaising_Account(String raising_Account) {
		Raising_Account = raising_Account;
	}

	public String getCollecting_household_names() {
		return Collecting_household_names;
	}

	public void setCollecting_household_names(String collecting_household_names) {
		Collecting_household_names = collecting_household_names;
	}

	public String getRaising_Bank() {
		return Raising_Bank;
	}

	public void setRaising_Bank(String raising_Bank) {
		Raising_Bank = raising_Bank;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}
}
