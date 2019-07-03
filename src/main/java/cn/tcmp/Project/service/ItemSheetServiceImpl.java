package cn.tcmp.Project.service;

import cn.tcmp.Project.mapper.ItemSheetMapper;
import cn.tcmp.entity.Channel_list;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.entity.Item_type_table;
import cn.tcmp.entity.Product_classification_table;
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
