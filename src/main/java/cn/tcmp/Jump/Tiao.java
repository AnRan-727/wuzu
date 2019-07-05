package cn.tcmp.Jump;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/22
 */
@Controller
public class Tiao {

    //文档查询
    @RequestMapping(value = "ChaXun")
    public String toChaXun(){
        return "WenDangLeiXing/ChaXun";
    }
    //营销项目查询
    @RequestMapping(value = "YinXiaoXiangMu")
    public String toYinXiaoXiangMu(){
        return "WenDangLeiXing/XiangQing/YinXiaoXiangMu";
    }
    //客户方向查询
    @RequestMapping(value = "KeHuFangXiang")
    public String toKeHuFangXiang(){
        return "WenDangLeiXing/XiangQing/KeHuFangXiang";
    }
    //项目修改
    @RequestMapping(value = "XiangMuXiuGai")
    public String toXiangMuXiuGai(){
        return "WenDangLeiXing/XiuGai/XiangMuXiuGai";
    }
    //客户修改
    @RequestMapping(value = "KeHuXiuGai")
    public String toKeHuXiuGai(){
        return "WenDangLeiXing/XiuGai/KeHuXiuGai";
    }
    //客户新建
    @RequestMapping(value = "KeHuXinJian")
    public String toKeHuXinJian(){
        return "WenDangLeiXing/XinJian/KeHuXinJian";
    }
    //项目新建
    @RequestMapping(value = "XiangMuXinJian")
    public String toXiangMuXinJian(){
        return "WenDangLeiXing/XinJian/XiangMuXinJian";
    }
    //渠道查询
    @RequestMapping(value = "QuDaoChaXun")
    public  String toQuDaoGuanLi(){
        return "QuDaoGuanLi/QuDaoChaXun";
    }
    //渠道详情
    @RequestMapping(value = "QuDaoXiangQing")
    public  String toQuDaoXiangQing(){
        return "QuDaoGuanLi/XiangQing/QuDaoXiangQing";
    }
    //渠道修改
    @RequestMapping(value = "QuDaoXiuGai")
    public  String toQuDaoXiuGai(){
        return "QuDaoGuanLi/XiuGai/QuDaoXiuGai";
    }
    //渠道新建
    @RequestMapping(value = "QuDaoXinJian")
    public  String toQuDaoXinJian(){
        return "QuDaoGuanLi/XinJian/QuDaoXinJian";
    }
    /*//项目查询
    @RequestMapping(value = "XiangMuChaXun")
    public  String toXiangMuChaXun(){
        return "XiangMuGuanLi/ChaXun";
    }*/

    //净值查询
    @RequestMapping(value = "JingZhiChaXun")
    public  String toJingZhiChaXun(){
        return "JingZhiGuanLi/ChaXun/JingZhiChaXun";
    }



}
