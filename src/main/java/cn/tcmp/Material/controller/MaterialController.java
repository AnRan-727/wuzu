package cn.tcmp.Material.controller;

import cn.tcmp.Document.service.DocumentService;
import cn.tcmp.Material.service.Material_period_Service;
import cn.tcmp.entity.Document_type_table;
import cn.tcmp.entity.Material_period;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/1
 */
@RequestMapping(value = "Material")
@Controller
public class MaterialController {

    //材料时期
    @Autowired
    private Material_period_Service material_period_service;
    //文档类型
    @Autowired
    private DocumentService documentService;

    //文档类型查询,模糊查询&&查全部
    @RequestMapping("queryMaterial")
    public String queryMaterial(String MaterialPeriodName ,String datetime,Integer pageNumber,Model model){

        if(pageNumber == null){
            pageNumber = 1 ;
        }
        System.out.println(pageNumber);
        Material_period material_period = new Material_period();
        System.err.println(datetime);
        //材料时期名称
        material_period.setMaterialPeriodName(MaterialPeriodName);

        //判断时间是否为空 并截取起始时间
        if(datetime != null && !datetime.equals("")){
            StringBuffer sb = new StringBuffer(datetime);
            String startTime = sb.substring(0,19);//开始时间
            String endTime = sb.substring(22);//结束时间
            System.err.println(startTime);
            System.err.println(endTime);
            material_period.setStartTime(startTime);
            material_period.setEndTime(endTime);
        }

        //文本框内容回显
        model.addAttribute("dateTime",datetime);
        model.addAttribute("MaterialPeriodName",MaterialPeriodName);

        model.addAttribute("material",material_period_service.queryAllMaterial_period(material_period,pageNumber,5));
        return "WenDangLeiXing/ChaXun";
    }

    //跳转到修改文档页面
    @RequestMapping(value = "toUpdateMaterial")
    public String toUpdateMaterial(Integer id,Model model) {
        List<Document_type_table> list = documentService.queryDocumentById(id);
        System.out.println(list);
        model.addAttribute("list",list);
        model.addAttribute("material",material_period_service.queryMaterial_periodById(id));
        return "WenDangLeiXing/XiuGai/XiangMuXiuGai";
    }





}
