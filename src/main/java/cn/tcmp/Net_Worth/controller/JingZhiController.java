package cn.tcmp.Net_Worth.controller;

import cn.tcmp.Net_Worth.service.JingZhiService;
import cn.tcmp.entity.Net_value_table;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class JingZhiController {
    @Autowired
    private JingZhiService service;
    @RequestMapping("queryNetValuePage")
    public  String queryNetValue(Net_value_table n,Integer pageNumber,Integer pageSize,Model model) {
        if(pageNumber == null){
            pageNumber = 1 ;
        }
        model.addAttribute("jingzhiPage",service.queryNetValuePage(n,pageNumber,pageSize));
        model.addAttribute("syList",service.queryAllSy());
        model.addAttribute("nvt", n);
        return "JingZhiGuanLi/ChaXun/JingZhiChaXun";
    }
    @RequestMapping("toAddJingzhi")
    public String toAddJingzhi() {
        return "JingZhiGuanLi/ChaXun/JingzhiXinJian";
    }
}
