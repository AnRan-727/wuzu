package cn.tcmp.Project.service;

import cn.tcmp.entity.*;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/26
 */
public interface ItemSheetService {
    //查询所有项目
    PageInfo<Item_sheet> queryAllItem_sheet(Integer pageNo, Integer pageSize, Item_sheet item_sheet);
    //查询项目详情
    Item_sheet detailItem_sheet(Integer itemid);
    //查询产品分类(下拉框)
    List<Product_classification_table> queryAllProduct();
    //查询项目类型(下拉框)
    List<Item_type_table> queryAllItem_type_table();
    //查询项目来源方(下拉框)
    List<Channel_list> queryAllChannel_list();
    //查询投资方式(下拉框)
    List<Investments_schedule> queryInvestments_schedule();
    //查询投资方向(下拉框)
    List<Investment_direction_table> queryInvestment_direction_table();
    //查询募集币种(下拉框)
    List<Currency_list> queryCurrency_list();
    //查询收益分配方式(下拉框)
    List<Distribution_of_income> queryDistribution_of_income();
    //查询收益分配频度(下拉框)
    List<Frequency_of_income_distribution> queryFrequency_of_income_distribution();
    //查询资产管理报告频度(下拉框)
    //List<Asset_management_
    //查询项目来源方部门(report> queryAsset_management_report();下拉框)
    List<Company_departments_list> queryCompany_departments_list();
    //新建项目
    int  saveItem_sheet(Item_sheet item_sheet);
    //修改项目
    int updateItem_sheet(Item_sheet item_sheet);
    //删除项目
    int deleteItem_sheet(Integer itemid);

    //根据项目类型查询项目
    List<Item_sheet> queryItemSheetByTypeId(Integer id);
}
