package cn.tcmp.entity;
import lombok.Data;

import java.util.Date;
import java.sql.*;

/**
 * net_value_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 净值表
* */
public class Net_value_table{
	private int Net_Worth_ID;
	private Product_list Product_ID;//产品ID
	private Income_type_statement Income_Type_ID;//收益类型ID
	private String Set_Up_Batch;
	private String Net_Worth;
	private String Cumulative_Net_Worth;
	private String Extremely_Profitable;
	private String Rate_Of_Return;
	private Date Valuation_Date;
	private Date Date_Of_Publication;
	private int Operator_ID;//操作人ID
	private Timestamp Operating_Date;



}
