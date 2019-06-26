package cn.tcmp.entity;

import lombok.Data;

/**
 * source_sector  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Source_sector{

	private int Source_ID;
	private String Source_Name;

	public void setSource_ID(int Source_ID){
		this.Source_ID=Source_ID;
	}

	public int getSource_ID(){
		return Source_ID;
	}

	public void setSource_Name(String Source_Name){
		this.Source_Name=Source_Name;
	}

	public String getSource_Name(){
		return Source_Name;
	}

}
