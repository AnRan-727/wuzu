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
        return "XiangMuGuanLi/ChaXun";
    }

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
        model.addAttribute("Asset_management_report",itemSheetService.queryAllItem_type_table());
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
     Integer pageSize,Integer itemid,Model model,String AttachmentName){
        System.err.println("itemid:"+itemid);
        Product_list product_list=new Product_list();
        if (pageNo==null){
            pageNo=1;
        }
        if (pageSize==null){
            pageSize=2;
        }
        List<Attached_table> Atttlist=productService.queryAllFuJian(AttachmentName);
        System.err.println("Atttlist:::"+Atttlist);
        model.addAttribute("Atttlist",Atttlist);
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

    //删除项目操作
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
    //去查询附件详情页
    @RequestMapping("toFuJianUpdate")
    public String toFuJianUpdate(Integer AttachedID,Model model){
        if (AttachedID!=null || AttachedID!=0){
            Attached_table table=productService.detailFuJian(AttachedID);
            model.addAttribute("tables",table);
        }
        return "XiangMuGuanLi/FuJian/FuJianUpdate";
    }
    //做附件修改操作
    @RequestMapping("doFuJianUpdate")
    @ResponseBody
    public String doupdateFuJian(Attached_table attached_table){
        Integer count=0;
        if (attached_table!=null){
            count=productService.updateFuJian(attached_table);
        }
        if (count>0){
            System.err.println("修改附件成功");
            return "ok";
        }
        return "error";
    }
    //做附件修改操作
    @RequestMapping("deleteFuJian")
    @ResponseBody
    public String deleteFuJian(Integer AttachedID){
        Integer count=0;
        if (AttachedID!=null || AttachedID!=0){
            count=productService.deleteFuJian(AttachedID);
        }
        if (count>0){
            System.err.println("删除附件成功");
            return "ok";
        }
        return "error";
    }
    //做附件修改操作
    @RequestMapping("deleteFuJian2")
    public String deleteFuJian2(Integer AttachedID){
        Integer count=0;
        if (AttachedID!=null || AttachedID!=0){
            count=productService.deleteFuJian(AttachedID);
        }
        if (count>0){
            System.err.println("删除附件成功");
            return "redirect:queryByItem_sheet";
        }
        return "redirect:queryByItem_sheet";
    }
}
