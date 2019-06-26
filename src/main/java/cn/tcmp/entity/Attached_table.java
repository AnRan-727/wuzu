package cn.tcmp.entity;
import lombok.Data;

import java.sql.*;

/**
 * attached_table  generated at 2019-06-26 13:37:47 by: eric
 */
@Data
public class Attached_table{
	private int Attached_ID;
	private String Attachment_Name;
	private String Attachment_Path;
	private String Attachment_Size;
	private int Creator_ID;
	private Timestamp Creation_Time;
	private String Project_ID;
	private String Annex_Description;

	public void setAttached_ID(int Attached_ID){
		this.Attached_ID=Attached_ID;
	}

	public int getAttached_ID(){
		return Attached_ID;
	}

	public void setAttachment_Name(String Attachment_Name){
		this.Attachment_Name=Attachment_Name;
	}

	public String getAttachment_Name(){
		return Attachment_Name;
	}

	public void setAttachment_Path(String Attachment_Path){
		this.Attachment_Path=Attachment_Path;
	}

	public String getAttachment_Path(){
		return Attachment_Path;
	}

	public void setAttachment_Size(String Attachment_Size){
		this.Attachment_Size=Attachment_Size;
	}

	public String getAttachment_Size(){
		return Attachment_Size;
	}

	public void setCreator_ID(int Creator_ID){
		this.Creator_ID=Creator_ID;
	}

	public int getCreator_ID(){
		return Creator_ID;
	}

	public void setCreation_Time(Timestamp Creation_Time){
		this.Creation_Time=Creation_Time;
	}

	public Timestamp getCreation_Time(){
		return Creation_Time;
	}

	public void setProject_ID(String Project_ID){
		this.Project_ID=Project_ID;
	}

	public String getProject_ID(){
		return Project_ID;
	}

	public void setAnnex_Description(String Annex_Description){
		this.Annex_Description=Annex_Description;
	}

	public String getAnnex_Description(){
		return Annex_Description;
	}

}
