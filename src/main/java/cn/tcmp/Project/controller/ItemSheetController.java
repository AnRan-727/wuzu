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
        item_sheet.setProductclassificationID(p);
        item_sheet.setItemtypeID(it);
        item_sheet.setChanneltableID(ch);
        model.addAttribute("page",itemSheetService.queryAllItem_sheet(1,5,item_sheet));

        return "XiangMuGuanLi/ChaXun";
    }

    //项目查询页模糊查询
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

    //去项目修改页
    @RequestMapping("XiangMuUpdate")
    public String XiangMuUpdate(Integer itemid,Model model){
        model.addAttribute("product_type",itemSheetService.queryAllProduct());
        model.addAttribute("channel_list",itemSheetService.queryAllChannel_list());
        model.addAttribute("item_type",itemSheetService.queryAllItem_type_table());
        model.addAttribute("Investments_schedule",itemSheetService.queryInvestments_schedule());
        model.addAttribute("Investment_direction_table",itemSheetService.queryInvestment_direction_table());
        model.addAttribute("Currency_list",itemSheetService.queryCurrency_list());
        model.addAttribute("Distribution_of_income",itemSheetService.queryDistribution_of_income());
        model.addAttribute("Frequency_of_income_distribution",itemSheetService.queryFrequency_of_income_distribution());
        model.addAttribute("Asset_management_report",itemSheetService.queryAsset_management_report());
        model.addAttribute("Source_sector",itemSheetService.querySource_sector());
        //项目详情回显
        Item_sheet item_sheet=itemSheetService.detailItem_sheet(itemid);
        System.err.println("item_sheet"+item_sheet);
        model.addAttribute("islist",item_sheet);
        return "XiangMuGuanLi/YeQian/YeQianXinXi";
    }


}
