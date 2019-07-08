package cn.tcmp.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.sql.*;

/**
 * net_value_table  generated at 2019-06-27 15:55:25 by: eric
 */
@Data
/**
 * 净值表
* */
@AllArgsConstructor
@NoArgsConstructor
public class Net_value_table{
	private int NetWorthID;//净值id
	private Product_list ProductID = new Product_list();//产品ID
	private Income_type_statement IncomeTypeID = new Income_type_statement();//收益类型ID
	private String SetUpBatch;//成立批次
	private String NetWorth;//净值
	private String CumulativeNetWorth;//累计净值
	private String ExtremelyProfitable;//每万份收益
	private String RateOfReturn;//七日年化收益率
	private Date ValuationDate;//估值日期
	private Date DateOfPublication;//发布日期
	private int OperatorID;//操作人ID
	private Timestamp OperatingDate;//操作日期



}
