package cn.tcmp.Project.service;

import cn.tcmp.Project.mapper.ItemSheetMapper;
import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.entity.Item_type_table;
import cn.tcmp.entity.Product_classification_table;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class ItemSheetServiceImpl implements ItemSheetService {
    @Resource
    private ItemSheetMapper itemSheetMapper;
    @Override
    public List<Item_sheet> queryAllItem_sheet(Item_sheet item_sheet) {
        return itemSheetMapper.queryAllItem_sheet(item_sheet);
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
}
