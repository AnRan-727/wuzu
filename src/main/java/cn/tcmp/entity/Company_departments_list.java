package cn.tcmp.entity;

import lombok.Data;

/**
 * company_departments_list  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Company_departments_list{
	private int Department_ID;
	private int Company_ID;
	private String Department_name;
	private String Departmental_Contacts;
	private String Introduction_of_Departmental_Contacts;
	private String Departmental_Introduction;

	public void setDepartment_ID(int Department_ID){
		this.Department_ID=Department_ID;
	}

	public int getDepartment_ID(){
		return Department_ID;
	}

	public void setCompany_ID(int Company_ID){
		this.Company_ID=Company_ID;
	}

	public int getCompany_ID(){
		return Company_ID;
	}

	public void setDepartment_name(String Department_name){
		this.Department_name=Department_name;
	}

	public String getDepartment_name(){
		return Department_name;
	}

	public void setDepartmental_Contacts(String Departmental_Contacts){
		this.Departmental_Contacts=Departmental_Contacts;
	}

	public String getDepartmental_Contacts(){
		return Departmental_Contacts;
	}

	public void setIntroduction_of_Departmental_Contacts(String Introduction_of_Departmental_Contacts){
		this.Introduction_of_Departmental_Contacts=Introduction_of_Departmental_Contacts;
	}

	public String getIntroduction_of_Departmental_Contacts(){
		return Introduction_of_Departmental_Contacts;
	}

	public void setDepartmental_Introduction(String Departmental_Introduction){
		this.Departmental_Introduction=Departmental_Introduction;
	}

	public String getDepartmental_Introduction(){
		return Departmental_Introduction;
	}

}
