package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * item_sheet  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
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



}
