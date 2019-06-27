package cn.tcmp.entity;

import lombok.Data;

/**
 * channel_list  generated at 2019-06-27 15:55:25 by: eric
 */

@Data
public class Channel_list{
	private int ID;
	private int Channel_type_ID;
	private String Corporate_name;
	private String introduce;
	private String Contact_Name;
	private String Contact_telephone;
	private String Contact_E_mail;
	private String Document_type;
	private String Identification_Number;
	private String Enclosure;

	public void setID(int ID){
		this.ID=ID;
	}

	public int getID(){
		return ID;
	}

	public void setChannel_type_ID(int Channel_type_ID){
		this.Channel_type_ID=Channel_type_ID;
	}

	public int getChannel_type_ID(){
		return Channel_type_ID;
	}

	public void setCorporate_name(String Corporate_name){
		this.Corporate_name=Corporate_name;
	}

	public String getCorporate_name(){
		return Corporate_name;
	}

	public void setIntroduce(String introduce){
		this.introduce=introduce;
	}

	public String getIntroduce(){
		return introduce;
	}

	public void setContact_Name(String Contact_Name){
		this.Contact_Name=Contact_Name;
	}

	public String getContact_Name(){
		return Contact_Name;
	}

	public void setContact_telephone(String Contact_telephone){
		this.Contact_telephone=Contact_telephone;
	}

	public String getContact_telephone(){
		return Contact_telephone;
	}

	public void setContact_E_mail(String Contact_E_mail){
		this.Contact_E_mail=Contact_E_mail;
	}

	public String getContact_E_mail(){
		return Contact_E_mail;
	}

	public void setDocument_type(String Document_type){
		this.Document_type=Document_type;
	}

	public String getDocument_type(){
		return Document_type;
	}

	public void setIdentification_Number(String Identification_Number){
		this.Identification_Number=Identification_Number;
	}

	public String getIdentification_Number(){
		return Identification_Number;
	}

	public void setEnclosure(String Enclosure){
		this.Enclosure=Enclosure;
	}

	public String getEnclosure(){
		return Enclosure;
	}

}
