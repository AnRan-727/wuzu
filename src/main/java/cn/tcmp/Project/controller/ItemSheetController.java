package cn.tcmp.Project.controller;

import cn.tcmp.Project.service.ItemSheetService;
import cn.tcmp.entity.Item_sheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
        return "XiangMuGuanLi/ChaXun";
    }
    @RequestMapping("queryByItem_sheet")
    public ModelAndView queryByitem_sheet(Item_sheet item_sheet){
        List<Item_sheet> itemsList=itemSheetService.queryAllItem_sheet(item_sheet);
        ModelAndView md=new ModelAndView();
        md.addObject("items",itemsList);
        md.setViewName("XiangMuGuanLi/ChaXun");
        return md;
    }
}
