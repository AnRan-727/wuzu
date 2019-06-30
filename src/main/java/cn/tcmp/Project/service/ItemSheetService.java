package cn.tcmp.Project.service;

import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.entity.Item_type_table;
import cn.tcmp.entity.Product_classification_table;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/26
 */
public interface ItemSheetService {
    //查询所有项目
    List<Item_sheet> queryAllItem_sheet(Item_sheet item_sheet);
    //查询产品分类(下拉框)
    List<Product_classification_table> queryAllProduct();
    //查询项目类型(下拉框)
    List<Item_type_table> queryAllItem_type_table();
    //查询项目来源方(下拉框)
    List<Channel_list> queryAllChannel_list();
}
