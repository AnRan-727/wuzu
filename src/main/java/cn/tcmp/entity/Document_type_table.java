package cn.tcmp.entity;
import lombok.Data;

import java.sql.*;

/**
 * document_type_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 文档类型表
 * */
public class Document_type_table{
	private int Document_Type_ID;
	private String Material_Period;
	private Push_direction_table Push_Direction_ID;//推送方向ID
	private int Is_Not_Push;
	private String Note_Description;
	private int Necessary_To_Go_Online;
	private int Operator_ID;//操作人ID
	private Date Operating_Time;


}
