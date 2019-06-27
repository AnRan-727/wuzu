package cn.tcmp.entity;
import lombok.Data;

import java.sql.*;

/**
 * attached_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Attached_table{
	private int Attached_ID;
	private String Attachment_Name;
	private String Attachment_Path;
	private String Attachment_Size;
	private int Creator_ID;//创建人ID
	private Timestamp Creation_Time;
	private Item_sheet Project_ID;//项目ID
	private String Annex_Description;


}
