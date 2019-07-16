package cn.tcmp.Product.controller;

import cn.tcmp.Product.service.NetValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("NetValue")
public class NetValueController {
    @Autowired
    private NetValueService service;

    @RequestMapping("queryAll")
    public String queryAll(Model model) {
        model.addAttribute("list", service.queryAll());
        return "ChanPinGuanLi/JinZhiFuDong";
    }


    @RequestMapping("ChaXunJinZhiXing")
    public String ChaXunJinZhiXing(Model model) {
        model.addAttribute("list", service.queryAll());
        return "ChanPinGuanLi/JinZhiXing";
    }

    @RequestMapping("XianJinGuanLi")
    public String XianJinGuanLi(Model model) {
        model.addAttribute("list", service.queryAll());
        return "ChanPinGuanLi/XianJinGuanLi";
    }
}
