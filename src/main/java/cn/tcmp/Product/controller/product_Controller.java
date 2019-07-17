package cn.tcmp.Product.controller;

import cn.tcmp.Net_Worth.service.JingZhiService;
import cn.tcmp.Product.service.NetValueService;
import cn.tcmp.Product.service.ProductService;
import cn.tcmp.Project.service.ItemSheetService;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.entity.Net_value_table;
import cn.tcmp.entity.Product_Accessories;
import cn.tcmp.entity.Product_list;
import cn.tcmp.entity.VO.ChanPinJingZhi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/15
 */
@Controller
@RequestMapping(value = "product_Controller")
public class product_Controller {


    @Autowired
    private ItemSheetService itemSheetService;
    @Autowired
    private ProductService productService;
    @Autowired
    private JingZhiService jingZhiService;

    //附件详情
    @RequestMapping(value = "toDetailAccess")
    @ResponseBody
    public List<Product_Accessories> queryProductAccessories(Product_Accessories productAccessories, String datetime){
        //判断时间是否为空 并截取起始时间
        if(datetime != null && !datetime.equals("")){
            StringBuffer sb = new StringBuffer(datetime);
            String startTime = sb.substring(0,19);//开始时间
            String endTime = sb.substring(22);//结束时间
            System.err.println(startTime);
            System.err.println(endTime);
            productAccessories.setStartTime(startTime);
            productAccessories.setEndTime(endTime);
        }
        return productService.queryAllProductAccessories(productAccessories);
    }
    //去新增附件页面
    @RequestMapping(value = "toAddProductAccessories")
    public String toAddProductAccessories(Integer id,Model model){
        model.addAttribute("id",id);
        return "ChanPinGuanLi/XinJian/FuJianXinJian";
    }
    //新增附件
    @RequestMapping(value = "doAddProductAccessories")
    @ResponseBody
    public boolean doAddProductAccessories(Product_Accessories productAccessories){
        if(productService.addProductAccessories(productAccessories) > 0){
            return true;
        }
        return false;
    }

    //去修改附件页面
    @RequestMapping(value = "toUpdateProductAccessories")
    public String toUpdateProductAccessories(Integer id,Model model){
        model.addAttribute("data",productService.detailProductAccessories(id));
        return "ChanPinGuanLi/XiuGai/FuJianXiuGai";
    }
    //修改附件
    @RequestMapping(value = "doUpdateProductAccessories")
    public String doUpdateProductAccessories(Product_Accessories productAccessories){
        productService.updateProductAccessories(productAccessories);
        return "redirect:/product/queryAll";
    }
    //删除附件
    @RequestMapping(value = "doDeleteProductAccessories")
    public String doDeleteProductAccessories(Integer id){
        productService.deleteProductAccessories(id);
        return "redirect:/product/queryAll";
    }

    //产品净值详情
    @RequestMapping(value = "queryChanPinJingZhi")
    @ResponseBody
    public List<Net_value_table> queryChanPinJingZhi(ChanPinJingZhi chanPinJingZhi){
        String dataTime = chanPinJingZhi.getDateTime();
        //判断时间是否为空 并截取起始时间
        if(dataTime != null && !dataTime.equals("")){
            StringBuffer sb = new StringBuffer(dataTime);
            String startTime = sb.substring(0,10);//开始时间
            String endTime = sb.substring(13);//结束时间
            System.err.println(startTime);
            System.err.println(endTime);
            chanPinJingZhi.setStartTime(startTime);
            chanPinJingZhi.setEndTime(endTime);
        }
        return jingZhiService.queryChanPinJingZhi(chanPinJingZhi);
    }

    //详情
    @RequestMapping(value = "toDetailProduct_List")
    public String toDetailProduct_List(Product_Accessories productAccessories, String datetime, Model model){
        Integer id = productAccessories.getProduct_list().getProductID();
        System.out.println("======>附件:"+productAccessories);
        Product_list product_list = productService.detailProduct(id);
        System.out.println("========>产品详情:"+product_list);
        //产品详情
        model.addAttribute("product",product_list);

        //产品投向
        model.addAttribute("touXiang", productService.TouXiangXiaLaKuang());
        //收益类型
        model.addAttribute("shouYi",productService.ShouYiLeiXing());
        //收益分配频度(周期)
        model.addAttribute("zhouQi",itemSheetService.queryFrequency_of_income_distribution());
        //项目详情
        model.addAttribute("item",itemSheetService.detailItem_sheet(product_list.getItemID().getItemID()));
        return "ChanPinGuanLi/XiangQing/ChanPinXiangQing";
    }


    //去关联项目
    @RequestMapping(value = "toGuanoLianProductName")
    public String toGuanoLianProductName(Model model){
        model.addAttribute("itemType",itemSheetService.queryAllItem_type_table());

        return "ChanPinGuanLi/XinJian/GuanLianXiangMu";
    }


    //根据项目类型查询项目
    @RequestMapping(value = "ajaxQueryItem")
    @ResponseBody
    public List<Item_sheet> ajaxQueryItem(Integer id){
        return itemSheetService.queryItemSheetByTypeId(id);
    }

    //去产品新增页面
    @RequestMapping(value = "toAddProduct_List")
    public String toAddProduct(Integer id,Model model){
        //获取最后的产品代码
        String code = productService.queryMaxProductCode().getProductCode();
        String start = code.substring(0,2);
        Integer end = Integer.valueOf(code.substring(2))+1;

        //生成产品代码
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(start);
        stringBuffer.append(end.toString());
        model.addAttribute("code",stringBuffer.toString());
        //关联的项目
        model.addAttribute("item",itemSheetService.detailItem_sheet(id));
        //产品投向
        model.addAttribute("touXiang", productService.TouXiangXiaLaKuang());
        //销售渠道
        model.addAttribute("quDao","");
        //收益类型
        model.addAttribute("shouYi",productService.ShouYiLeiXing());
        //收益分配频度(周期)
        model.addAttribute("zhouQi",itemSheetService.queryFrequency_of_income_distribution());
        return "ChanPinGuanLi/XinJian/ChanPinXinJan";
    }

    //进行新增操作
    @RequestMapping(value = "doAddProduct_List")
    public String doAddProduct_List(Product_list product_list){
        System.out.println("==========>产品:"+product_list);
        productService.addProduct(product_list);
        return "redirect:/product/queryAll";
    }
    //去修改产品页面
    @RequestMapping(value = "toUpdateProduct_List")
    public String toUpdateProduct_List(Integer id,Model model){
        System.out.println("======>ID:"+id);
        Product_list product_list = productService.detailProduct(id);
        System.out.println("========>产品详情:"+product_list);
        //产品详情
        model.addAttribute("product",product_list);
        //产品投向
        model.addAttribute("touXiang", productService.TouXiangXiaLaKuang());
        //收益类型
        model.addAttribute("shouYi",productService.ShouYiLeiXing());
        //收益分配频度(周期)
        model.addAttribute("zhouQi",itemSheetService.queryFrequency_of_income_distribution());
        //项目详情
        model.addAttribute("item",itemSheetService.detailItem_sheet(product_list.getItemID().getItemID()));
        return "ChanPinGuanLi/XiuGai/ChanPinXiuGai";
    }
    //修改产品
    @RequestMapping(value = "doUpdateProduct_List")
    public String doUpdateProduct_List(Product_list product_list){
        productService.updateProduct(product_list);
        return "redirect:/product/queryAll";
    }

}
