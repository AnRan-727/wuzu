package cn.tcmp.entity;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/3
 */
/**
 * 收益级别表
 * */
@Data
public class Revenue_Level {

    private Integer ProfitId;
    private String RevenueLevel,Lowerlimitofamount,Upperlimitofamount,Expectedrateofreturn,EarningsLevelTerm,EarningsLevelTermUnit,Remarks,IncomeLevelGroupName;



}
