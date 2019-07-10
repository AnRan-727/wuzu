package cn.tcmp.Net_Worth.controller;
import cn.tcmp.Net_Worth.service.JingZhiService;
import cn.tcmp.entity.Net_value_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JingZhiController {
    @Autowired
    private JingZhiService service;
    //分页查询显示净值信息
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

    //净值修改跳转
    @RequestMapping("toUpdateJz")
    public String toUpdateJz(Integer NetWorthID,Integer IncomeTypeID, Model model) {
        System.out.println("净值id—————————————————————————"+NetWorthID);
        System.out.println("收益类型————————————————————————"+IncomeTypeID);

        if(IncomeTypeID ==1){
            model.addAttribute("jzList",service.detailJingzhi(NetWorthID));
            return "JingZhiGuanLi/JingZhiXiuGai/FuDongShouyi";
        } else if (IncomeTypeID == 2) {
            model.addAttribute("jzList",service.detailJingzhi(NetWorthID));
            return "JingZhiGuanLi/JingZhiXiuGai/JingZhiShouyi";
        } else if (IncomeTypeID == 3) {
            model.addAttribute("jzList",service.detailJingzhi(NetWorthID));
            return "JingZhiGuanLi/JingZhiXiuGai/XianJinShouyi";
        }
        return "";
    }
    //修改浮动型净值
    @RequestMapping("doUpdateFudongSy")
    public String doUpdateFudongSy(Net_value_table n) {
        this.service.updateNvtFudong(n);
        return "redirect:queryNetValuePage";
    }
    //修改净值型净值
    @RequestMapping("doUpdateJingZhiSy")
    public String doUpdateJingZhiSy(Net_value_table n) {
        this.service.updateNvtJIngzhi(n);
        return "redirect:queryNetValuePage";
    }
    //修改现金管理型型净值
    @RequestMapping("doUpdateXianJinSy")
    public String doUpdateXianJinSy(Net_value_table n) {
        this.service.updateNvtXianjin(n);
        return "redirect:queryNetValuePage";
    }


    //跳转增加
    @RequestMapping("toAddJingzhi")
    public String toAddJingzhi() {
        return "JingZhiGuanLi/Xinjian/xinjian";
    }
}
