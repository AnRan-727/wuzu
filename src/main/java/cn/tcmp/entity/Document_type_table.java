package cn.tcmp.entity;

import lombok.Data;

/**
 * document_type_table  generated at 2019-06-28 08:07:37 by: eric
 */

@Data
/**
 *文档类型表
 * */
public class Document_type_table{
	private Integer DocumentTypeID;
	private String DocumentTypeName;
	private Material_period MaterialPeriodID;//材料时期ID
	private String MPID;
	private Integer NecessaryToGoOnline;
	private String MaintenanceAuthority;
	private String ViewingPermissions;
	private String NoteDescription;
	private String ChuangJianRen;
	private String ShangChuanRiQi;
	private String WenJianDaXiao;
}
