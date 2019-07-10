package cn.tcmp.Material.controller;

import cn.tcmp.Document.service.DocumentService;
import cn.tcmp.Material.service.Material_period_Service;
import cn.tcmp.entity.Document_type_table;
import cn.tcmp.entity.Material_period;
import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String toUpdateMaterial(Integer MaterialPeriodID,String MaterialPeriodName,Integer pageNumber,Model model) {
        if(pageNumber == null){
            pageNumber = 1;
        }
        System.out.println("id:"+MaterialPeriodID);
        System.out.println("Name:"+MaterialPeriodName);
        System.out.println("PageNumber:"+pageNumber);
        PageInfo<Document_type_table> list = documentService.queryDocumentById(MaterialPeriodID,pageNumber,5);
        System.out.println(list);
        model.addAttribute("list",list);
        model.addAttribute("material", material_period_service.queryMaterial_periodById(MaterialPeriodID));
        if(MaterialPeriodName.equals("客户方向")){
            return "WenDangLeiXing/XiuGai/KeHuXiuGai";
        }
        return "WenDangLeiXing/XiuGai/XiangMuXiuGai";
    }

    //进行修改文档操作
    @ResponseBody
    @RequestMapping(value = "doUpdateMaterial")
    public String doUpdateMaterial(Material_period material_period){
        System.out.println("修改材料时期:"+material_period);
        if(material_period_service.updateMaterial_period(material_period) > 0){
            return "ok";
        }
        return "error";
    }

    //ajax查询单条文档类型
    @ResponseBody
    @RequestMapping("queryDocumentByDocumentId")
    public Document_type_table queryDocumentByDocumentId(Integer DocumentId){
        Document_type_table document_type_table = documentService.queryDocumentByDocumentId(DocumentId);
        System.out.println("文档类型:"+document_type_table);
        return document_type_table;
    }

    //ajax删除单个材料时期
    @ResponseBody
    @RequestMapping("doAjaxDeleteMaterial")
    public Integer doAjaxDeleteMaterial(Integer id){

        //判断该材料时期是否有文档
        if(documentService.queryDocumentById(id,1,5).getList().size() > 0){
            return 3;
        }
        //判断是否删除成功
        if(material_period_service.deleteMaterial_period(id) > 0){
            return 1;
        }
        return 0;
    }

    //ajax增加材料时期
    @RequestMapping(value = "doAjaxAddMaterial")
    @ResponseBody
    public Integer doAjaxAddMaterial(Material_period material_period) {
        material_period_service.addMaterial_period(material_period);
        return material_period.getMaterialPeriodID();
    }

    //详情
    @RequestMapping(value = "toDetailMaterial")
    public String toDetailMaterial(Integer MaterialPeriodID,String MaterialPeriodName,Integer pageNumber,Model model){

        if(pageNumber == null){
            pageNumber = 1;
        }

        Material_period material_period = material_period_service.queryMaterial_periodById(MaterialPeriodID);

        System.out.println("材料时期详情========>"+material_period);

        PageInfo<Document_type_table> list = documentService.queryDocumentById(MaterialPeriodID,pageNumber,5);

        System.out.println("文档类型==========>"+list);

        model.addAttribute("list",list);

        model.addAttribute("material",material_period);
        if(MaterialPeriodName.equals("客户方向")){
            return "WenDangLeiXing/XiangQing/KeHuFangXiang";
        }
        return "WenDangLeiXing/XiangQing/YinXiaoXiangMu";
    }


}
