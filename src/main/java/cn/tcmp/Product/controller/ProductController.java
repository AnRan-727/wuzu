package cn.tcmp.Product.controller;

import cn.tcmp.Product.service.ProductService;
import cn.tcmp.entity.Item_sheet;
import cn.tcmp.entity.Item_type_table;
import cn.tcmp.entity.Product_list;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
            pageSize=2;
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
    public String toAddProduct() {
        return "ChanPinGuanLi/ChanPinTianJia";
    }

}
