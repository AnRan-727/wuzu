package cn.tcmp.entity;
import lombok.Data;

import java.sql.*;

/**
 * document_type_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Document_type_table{
	private int Document_Type_ID;
	private String Material_Period;
	private int Push_Direction_ID;
	private int Is_Not_Push;
	private String Note_Description;
	private int Necessary_To_Go_Online;
	private int Operator_ID;
	private Timestamp Operating_Time;

	public void setDocument_Type_ID(int Document_Type_ID){
		this.Document_Type_ID=Document_Type_ID;
	}

	public int getDocument_Type_ID(){
		return Document_Type_ID;
	}

	public void setMaterial_Period(String Material_Period){
		this.Material_Period=Material_Period;
	}

	public String getMaterial_Period(){
		return Material_Period;
	}

	public void setPush_Direction_ID(int Push_Direction_ID){
		this.Push_Direction_ID=Push_Direction_ID;
	}

	public int getPush_Direction_ID(){
		return Push_Direction_ID;
	}

	public void setIs_Not_Push(int Is_Not_Push){
		this.Is_Not_Push=Is_Not_Push;
	}

	public int getIs_Not_Push(){
		return Is_Not_Push;
	}

	public void setNote_Description(String Note_Description){
		this.Note_Description=Note_Description;
	}

	public String getNote_Description(){
		return Note_Description;
	}

	public void setNecessary_To_Go_Online(int Necessary_To_Go_Online){
		this.Necessary_To_Go_Online=Necessary_To_Go_Online;
	}

	public int getNecessary_To_Go_Online(){
		return Necessary_To_Go_Online;
	}

	public void setOperator_ID(int Operator_ID){
		this.Operator_ID=Operator_ID;
	}

	public int getOperator_ID(){
		return Operator_ID;
	}

	public void setOperating_Time(Timestamp Operating_Time){
		this.Operating_Time=Operating_Time;
	}

	public Timestamp getOperating_Time(){
		return Operating_Time;
	}

}
