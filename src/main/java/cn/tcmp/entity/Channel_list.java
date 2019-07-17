package cn.tcmp.entity;

import lombok.Data;

import java.sql.Date;

/**
 * channel_list  generated at 2019-06-27 15:55:25 by: eric
 */



/**
 * 公司表 & 渠道表
 * */
@Data
public class Channel_list{
	private Integer ChannelID;
	private Channel_Type ChanneltypeID;//渠道类型ID
	private Integer chaId;
	private String Corporatename;
	private String introduce;
	private String ContactName;
	private String Contacttelephone;
	private String ContactEmail;
	private String Documenttype;
	private String dt;
	private String IdentificationNumber;
	private String Enclosure;
	private Date CreationDate;



}
