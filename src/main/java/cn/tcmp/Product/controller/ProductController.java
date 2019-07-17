package cn.tcmp.Product.controller;

import cn.tcmp.Product.service.ProductService;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.entity.Item_type_table;
import cn.tcmp.entity.Product_list;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
@RequestMapping("product")
public class ProductController {
    @Resource
    private ProductService productService;

    @RequestMapping(value = "queryAll", method = RequestMethod.GET)
    public String queryAll(Product_list product_list, Integer pageNum, Integer pageSize, Model model) {
        if (pageNum ==null) {
            pageNum=1;
    }
        if (pageSize ==null) {
            pageSize=5;
    }
        model.addAttribute("page", productService.queryAll(product_list, pageNum, pageSize));
        System.err.println(productService.queryAll(product_list, pageNum, pageSize));
        Item_type_table item_type_table = new Item_type_table();
        Item_sheet item_sheet = new Item_sheet();
        item_sheet.setItemtypeID(item_type_table);
        Product_list product_list1 = new Product_list();

        product_list.setItemID(item_sheet);

        return "ChanPinGuanLi/product_list";
    }

    @RequestMapping("toAddProduct")
    public String toAddProduct(Product_list product_list,Integer pageNum,Integer pageSize,Model model) {
        model.addAttribute("ShouYiLeiXing", productService.ShouYiLeiXing());
        model.addAttribute("xialakuang", productService.queryXiaLaKuang());
        model.addAttribute("touxiang", productService.TouXiangXiaLaKuang());
        model.addAttribute("ChanPinXiaLaKuang",productService.queryChanPinXiaLaKuang());
        model.addAttribute("page", productService.queryAll(product_list, 1, 2));
        return "ChanPinGuanLi/ChanPinTianJia";
    }

    @RequestMapping("doAddProduct")
    public String doAddProduct(Product_list product_list) {
        Integer count = productService.addProduct(product_list);
        if (count > 0) {
            System.out.println("添加成功");
        }
        return "redirect:queryAll";
    }

    @RequestMapping("toUpdateProduct")
    public String toUpdateProduct(Product_list product_list,Integer ProductId, Model model) {
        model.addAttribute("ShouYiLeiXing", productService.ShouYiLeiXing());
        System.err.println("+++++++++"+productService.TouXiangXiaLaKuang());
        model.addAttribute("touxiang", productService.TouXiangXiaLaKuang());
        model.addAttribute("xialakuang", productService.queryXiaLaKuang());
        model.addAttribute("ChanPinXiaLaKuang", productService.queryChanPinXiaLaKuang());
        System.err.println("+++++++++++++"+productService.detailProduct(ProductId));
        model.addAttribute("detail", productService.detailProduct(ProductId));
        return "ChanPinGuanLi/ChanPinXiuGai";
    }

    @RequestMapping("doUpdateProduct")
    public String doUpdateProduct(Product_list product_list, Integer ProductID, Model model) {
        Integer count = productService.updateProduct(product_list);
        if (count > 0) {
            System.out.println("修改成功");
        }
        return "redirect:queryAll";
    }


}
