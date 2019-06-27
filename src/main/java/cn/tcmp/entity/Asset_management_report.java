package cn.tcmp.entity;

import lombok.Data;

/**
 * asset_management_report  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Asset_management_report{
	private int amrID;
	private String amrName;

	public void setAmrID(int amrID){
		this.amrID=amrID;
	}

	public int getAmrID(){
		return amrID;
	}

	public void setAmrName(String amrName){
		this.amrName=amrName;
	}

	public String getAmrName(){
		return amrName;
	}

}
