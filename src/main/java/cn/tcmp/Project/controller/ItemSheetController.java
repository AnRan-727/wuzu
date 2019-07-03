package cn.tcmp.Project.controller;

import cn.tcmp.Project.service.ItemSheetService;
import cn.tcmp.entity.*;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/26
 */
@Controller
@RequestMapping("item")
public class ItemSheetController {
    @Autowired
    private ItemSheetService itemSheetService;

    //查询项目查询页的所有下拉框
    @RequestMapping("queryAllDropdownBox")
    public String queryAll(Model model){
        model.addAttribute("product_type",itemSheetService.queryAllProduct());
        model.addAttribute("channel_list",itemSheetService.queryAllChannel_list());
        model.addAttribute("item_type",itemSheetService.queryAllItem_type_table());
        Product_classification_table p=new Product_classification_table();
        Item_type_table it=new Item_type_table();
        Channel_list ch=new Channel_list();
        Item_sheet item_sheet=new Item_sheet();
        item_sheet.setProduct_classification_ID(p);
        item_sheet.setItem_type_ID(it);
        item_sheet.setChannel_table_ID(ch);
        model.addAttribute("page",itemSheetService.queryAllItem_sheet(1,5,item_sheet));

        return "XiangMuGuanLi/ChaXun";
    }
    @RequestMapping("queryByItem_sheet")
    public ModelAndView queryByitem_sheet(Integer pageNo, Integer pageSize,Item_sheet item_sheet){
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=5;
        }
        PageInfo<Item_sheet> itemsList=itemSheetService.queryAllItem_sheet(pageNo,pageSize,item_sheet);
        ModelAndView md=new ModelAndView();
        md.addObject("page",itemsList);
        md.setViewName("XiangMuGuanLi/ChaXun");
        return md;
    }
}
