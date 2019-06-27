package cn.tcmp.entity;

import lombok.Data;

/**
 * company_departments_list  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Company_departments_list{
	private int Department_ID;
	private Channel_list Company_ID;//公司ID||渠道ID
	private String Department_name;
	private String Departmental_Contacts;
	private String Introduction_of_Departmental_Contacts;
	private String Departmental_Introduction;



}
