package cn.tcmp.entity;

import lombok.Data;

/**
 * push_direction_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Push_direction_table{
	private int Push_Direction_ID;
	private String Push_Direction_Name;

	public void setPush_Direction_ID(int Push_Direction_ID){
		this.Push_Direction_ID=Push_Direction_ID;
	}

	public int getPush_Direction_ID(){
		return Push_Direction_ID;
	}

	public void setPush_Direction_Name(String Push_Direction_Name){
		this.Push_Direction_Name=Push_Direction_Name;
	}

	public String getPush_Direction_Name(){
		return Push_Direction_Name;
	}

}
