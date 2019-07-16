package cn.tcmp.Project.controller;

import cn.tcmp.Product.service.ProductService;
import cn.tcmp.Project.service.ItemSheetService;
import cn.tcmp.entity.*;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @Autowired
    private ProductService productService;

    //查询项目查询页的所有下拉框
    @RequestMapping("queryAllDropdownBox")
    public String queryAll(Integer pageNo, Integer pageSize,Model model){
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
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=2;
        }
        model.addAttribute("page",itemSheetService.queryAllItem_sheet(pageNo,pageSize,item_sheet));

        return "XiangMuGuanLi/ChaXun";
    }

    //项目查询页模糊查询
    @RequestMapping("queryByItem_sheet")
    public String queryByitem_sheet(Integer pageNo, Integer pageSize,
        Item_sheet item_sheet,Item_type_table itt,
        Product_classification_table pct,Channel_list Channel_list,Model model){
        System.err.println("item_sheet:>>"+item_sheet);
        System.err.println("itt:>>"+itt);
        System.err.println("Channel_list:>>"+Channel_list);
        System.err.println("pct:>>"+pct);
        item_sheet.setItemtypeID(itt);
        item_sheet.setProductclassificationID(pct);
        item_sheet.setChanneltableID(Channel_list);
        model.addAttribute("product_type",itemSheetService.queryAllProduct());
        model.addAttribute("channel_list",itemSheetService.queryAllChannel_list());
        model.addAttribute("item_type",itemSheetService.queryAllItem_type_table());
        model.addAttribute("pct",pct);
        model.addAttribute("itt",itt);
        model.addAttribute("Channel_list",Channel_list);
        model.addAttribute("item_sheet",item_sheet);
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=2;
        }
        PageInfo<Item_sheet> itemsList=itemSheetService.queryAllItem_sheet(pageNo,pageSize,item_sheet);
        System.err.println("service+itemsList+"+itemsList.getList());
        model.addAttribute("page",itemsList);
        /*ModelAndView md=new ModelAndView();
        md.addObject("page",itemsList);
        md.setViewName("XiangMuGuanLi/ChaXun");*/
        return "XiangMuGuanLi/ChaXun";
    }
    /*//项目查询页模糊查询
    @RequestMapping("queryByItem_sheetAjax")
    @ResponseBody
    public PageInfo<Item_sheet> queryByitem_sheetAjax(Integer pageNo, Integer pageSize,
                                          Item_sheet item_sheet,Item_type_table itt,
                                          Product_classification_table pct,Channel_list Channel_list,Model model){
        System.err.println("pageNo:"+pageNo);
        System.err.println("pageSize:"+pageSize);
        item_sheet.setItemtypeID(itt);
        item_sheet.setProductclassificationID(pct);
        item_sheet.setChanneltableID(Channel_list);
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=1;
        }
        System.err.println("pageNo2:"+pageNo);
        System.err.println("pageSize2:"+pageSize);
        PageInfo<Item_sheet> pageInfo=itemSheetService.queryAllItem_sheet(pageNo,pageSize,item_sheet);
        System.err.println(pageInfo.getList());
        return pageInfo;
    }*/
    //去项目添加页
    @RequestMapping("XiangMuAdd")
    public String toXiangMuAdd(Model model){
        model.addAttribute("product_type",itemSheetService.queryAllProduct());
        model.addAttribute("channel_list",itemSheetService.queryAllChannel_list());
        model.addAttribute("item_type",itemSheetService.queryAllItem_type_table());
        model.addAttribute("Investments_schedule",itemSheetService.queryInvestments_schedule());
        model.addAttribute("Investment_direction_table",itemSheetService.queryInvestment_direction_table());
        model.addAttribute("Currency_list",itemSheetService.queryCurrency_list());
        model.addAttribute("Distribution_of_income",itemSheetService.queryDistribution_of_income());
        model.addAttribute("Frequency_of_income_distribution",itemSheetService.queryFrequency_of_income_distribution());
        model.addAttribute("Asset_management_report",itemSheetService.queryAsset_management_report());
        model.addAttribute("Company_departments_list",itemSheetService.queryCompany_departments_list());
        return "XiangMuGuanLi/ChaXunAdd";
    }
    //进行项目添加操作
    @RequestMapping("doXiangMuAdd")
    public String doXiangMuAdd(Item_sheet item_sheet){
        System.err.println("=============>"+item_sheet);
        Integer count=itemSheetService.saveItem_sheet(item_sheet);
        if (count>0){
            System.err.println("添加成功");
        }
        return "redirect:queryByItem_sheet";
    }

    //去项目修改页
    @RequestMapping("XiangMuUpdate")
    public String XiangMuUpdate(Integer pageNo,
     Integer pageSize,Integer itemid,Model model){
        System.err.println("itemid:"+itemid);
        Product_list product_list=new Product_list();
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=2;
        }
        model.addAttribute("page",productService.queryAll(product_list,pageNo,pageSize));
        model.addAttribute("product_type",itemSheetService.queryAllProduct());
        model.addAttribute("channel_list",itemSheetService.queryAllChannel_list());
        model.addAttribute("item_type",itemSheetService.queryAllItem_type_table());
        model.addAttribute("Investments_schedule",itemSheetService.queryInvestments_schedule());
        model.addAttribute("Investment_direction_table",itemSheetService.queryInvestment_direction_table());
        model.addAttribute("Currency_list",itemSheetService.queryCurrency_list());
        model.addAttribute("Distribution_of_income",itemSheetService.queryDistribution_of_income());
        model.addAttribute("Frequency_of_income_distribution",itemSheetService.queryFrequency_of_income_distribution());
        model.addAttribute("Asset_management_report",itemSheetService.queryAsset_management_report());
        model.addAttribute("Company_departments_list",itemSheetService.queryCompany_departments_list());
        //项目详情回显
        System.err.println("itemid:"+itemid);
        Item_sheet item_sheet=itemSheetService.detailItem_sheet(itemid);
        System.err.println("item_sheet:"+item_sheet);
        model.addAttribute("islist",item_sheet);
        return "XiangMuGuanLi/YeQian/YeQianXinXi";
    }
    //进行项目修改操作
    @RequestMapping("doXiangMuUpdate")
    public String doXiangMuUpdate(Item_sheet item_sheet,Item_type_table item_type_table){
        System.err.println("=============>"+item_sheet);
        System.err.println("======item_type_table=======>"+item_type_table);
        item_sheet.setItemtypeID(item_type_table);
        Integer count=itemSheetService.updateItem_sheet(item_sheet);
        if (count>0) {
            System.err.println("修改成功");
        }
        return "redirect:queryByItem_sheet";
    }
    /*@RequestMapping("XiangMuDelete")
    public String deleteXiangMu(Integer itemID){
        Integer count=itemSheetService.deleteItem_sheet(itemID);
        if (count>0){
            System.err.println("删除成功");
        }
        return "redirect:queryByItem_sheet";
    }*/
    @RequestMapping("XiangMuDelete")
    @ResponseBody
    public String deleteXiangMu(Integer itemID){
        Integer count=0;
        if(itemID!=null || itemID!=0){
            count=itemSheetService.deleteItem_sheet(itemID);
        }
        if (count>0){
            System.err.println("删除成功");
            return "ok";
        }
        return "error";
    }
    @RequestMapping("toFuJianAdd")
    public String toFuJianAdd(){
        System.out.println("................>>>");
        return "XiangMuGuanLi/FuJian/FuJianAdd";
    }
    @RequestMapping("toFuJianUpdate")
    public String toFuJianUpdate(){
        System.out.println("???????????????>");
        return "XiangMuGuanLi/FuJian/FuJianUpdate";
    }
}
