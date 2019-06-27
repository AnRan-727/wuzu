package cn.tcmp.entity;

import lombok.Data;

/**
 * channel_list  generated at 2019-06-27 15:55:25 by: eric
 */

@Data

/**
 * 公司表 & 渠道表
 * */
public class Channel_list{
	private int ID;
	private Channel_type Channel_type_ID;//渠道类型ID
	private String Corporate_name;
	private String introduce;
	private String Contact_Name;
	private String Contact_telephone;
	private String Contact_E_mail;
	private String Document_type;
	private String Identification_Number;
	private String Enclosure;



}
