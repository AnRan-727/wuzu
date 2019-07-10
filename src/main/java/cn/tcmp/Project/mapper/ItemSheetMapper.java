package cn.tcmp.Project.mapper;

import cn.tcmp.entity.*;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/26
 */
public interface ItemSheetMapper {

    //查询所有项目
    List<Item_sheet> queryAllItem_sheet(Item_sheet item_sheet);
    //查询项目详情
    Item_sheet detailItem_sheet(Integer itemid);
    //查询产品分类(下拉框)
    List<Product_classification_table> queryAllProduct();
    //查询项目类型(下拉框)
    List<Item_type_table> queryAllItem_type_table();
    //查询项目来源方(下拉框)
    List<Channel_list> queryAllChannel_list();
    //查询投资方式(下拉框)
    @Select("SELECT * FROM Investments_schedule")
    List<Investments_schedule> queryInvestments_schedule();
    // 查询投资方向(下拉框)
    @Select("SELECT * FROM Investment_direction_table")
    List<Investment_direction_table> queryInvestment_direction_table();
    //查询募集币种(下拉框)
    @Select("SELECT * FROM Currency_list")
    List<Currency_list> queryCurrency_list();
    //查询收益分配方式(下拉框)
    @Select("SELECT * FROM Distribution_of_income")
    List<Distribution_of_income> queryDistribution_of_income();
    //查询收益分配频度(下拉框)
    @Select("select * from Frequency_of_income_distribution")
    List<Frequency_of_income_distribution> queryFrequency_of_income_distribution();
    //查询资产管理报告频度(下拉框)
    @Select("select * from Asset_management_report")
    List<Asset_management_report> queryAsset_management_report();
    //查询项目来源方部门(下拉框)
    List<Company_departments_list> queryCompany_departments_list();
}
