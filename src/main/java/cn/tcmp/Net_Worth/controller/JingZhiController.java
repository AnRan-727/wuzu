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
    public  String queryNetValue(Net_value_table n,Integer pageNum,Integer pageSize,Model model) {
        if(pageNum == null){
            pageNum=1;
        }
        if (pageSize == null) {
            pageSize=3;
        }
        List<Net_value_table> list=service.queryNetValue(n);
        PageInfo<Net_value_table> pageInfo=new PageInfo<>(list);
        model.addAttribute("jingzhiPage",pageInfo);
        return "JingZhiGuanLi/ChaXun/JingZhiChaXun";
    }
}
