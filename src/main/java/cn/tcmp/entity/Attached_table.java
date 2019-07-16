package cn.tcmp.entity;
import lombok.Data;

import java.sql.*;

/**
 * attached_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
public class Attached_table{
	private Integer AttachedID;//附件id
	private String AttachmentName;//附件名称
	private String AttachmentPath;//附件路径
	private String AttachmentSize;//附件大小
	private String CreatorID;//创建人ID
	private Timestamp CreationTime;//创建时间
	private Item_sheet ProjectID;//项目ID
	private String AnnexDescription;//附件备注


}
