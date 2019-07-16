package cn.tcmp.Project.service;

import cn.tcmp.Project.mapper.ItemSheetMapper;
import cn.tcmp.entity.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ItemSheetServiceImpl implements ItemSheetService {
    @Resource
    private ItemSheetMapper itemSheetMapper;


    @Override
    public PageInfo<Item_sheet> queryAllItem_sheet(Integer pageNo, Integer pageSize, Item_sheet item_sheet) {
        PageHelper.startPage(pageNo,pageSize);
        List<Item_sheet> itemsList=itemSheetMapper.queryAllItem_sheet(item_sheet);
        PageInfo<Item_sheet> pageInfo=new PageInfo<>(itemsList);
        return pageInfo;
    }

    @Override
    public Item_sheet detailItem_sheet(Integer itemid) {
        return itemSheetMapper.detailItem_sheet(itemid);
    }

    @Override
    public List<Product_classification_table> queryAllProduct() {
        return itemSheetMapper.queryAllProduct();
    }

    @Override
    public List<Item_type_table> queryAllItem_type_table() {
        return itemSheetMapper.queryAllItem_type_table();
    }

    @Override
    public List<Channel_list> queryAllChannel_list() {
        return itemSheetMapper.queryAllChannel_list();
    }

    @Override
    public List<Investments_schedule> queryInvestments_schedule() {
        return itemSheetMapper.queryInvestments_schedule();
    }

    @Override
    public List<Investment_direction_table> queryInvestment_direction_table() {
        return itemSheetMapper.queryInvestment_direction_table();
    }

    @Override
    public List<Currency_list> queryCurrency_list() {
        return itemSheetMapper.queryCurrency_list();
    }

    @Override
    public List<Distribution_of_income> queryDistribution_of_income() {
        return itemSheetMapper.queryDistribution_of_income();
    }

    @Override
    public List<Frequency_of_income_distribution> queryFrequency_of_income_distribution() {
        return itemSheetMapper.queryFrequency_of_income_distribution();
    }

   /* @Override
    public List<Asset_management_report> queryAsset_management_report() {
        return itemSheetMapper.queryAsset_management_report();
    }*/

    @Override
    public List<Company_departments_list> queryCompany_departments_list() {
        return itemSheetMapper.queryCompany_departments_list();
    }

    @Override
    public int saveItem_sheet(Item_sheet item_sheet) {
        return itemSheetMapper.saveItem_sheet(item_sheet);
    }

    @Override
    public int updateItem_sheet(Item_sheet item_sheet) {
        System.err.println("service:"+item_sheet);
        return itemSheetMapper.updateItem_sheet(item_sheet);
    }

    @Override
    public int deleteItem_sheet(Integer itemid) {
        return itemSheetMapper.deleteItem_sheet(itemid);
    }

    @Override
    public List<Item_sheet> queryItemSheetByTypeId(Integer id) {
        return itemSheetMapper.queryItemSheetByTypeId(id);
    }

}
