package cn.tcmp.Document.controller;

import cn.tcmp.Document.service.DocumentService;
import cn.tcmp.entity.Document_type_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/1
 */
@Controller
@RequestMapping(value = "document")
public class DocumentController {

    @Autowired
    private DocumentService documentService;



    //ajax修改文档类型
    @ResponseBody
    @RequestMapping(value = "doAjaxUpdateDocument")
    public String doAjaxUpdateDocument(Document_type_table document_type_table) {
        System.out.println("修改文档类型:"+document_type_table);
        if(documentService.updateDocument(document_type_table)>0){
            return "ok";
        }
        return "error";
    }

    //ajax删除文档类型
    @ResponseBody
    @RequestMapping(value = "doAjaxDeleteDocument")
    public Integer doAjaxDeleteDocument(Integer id) {
        Integer count = documentService.deleteDocument(id);
        System.out.println("受影响的行数:"+count);
        return count;
    }


    //去新建文档类型页面
    @RequestMapping(value = "toAddDocument")
    public String toAddDocument(Model model){
        model.addAttribute("push",documentService.queryAllPush());
        return "WenDangLeiXing/XinJian/WenDangXinJian";
    }

    //新增文档类型
    @RequestMapping(value = "doAddDocument")
    public String doAddDocument(Document_type_table document_type_table){
        documentService.addDocument(document_type_table);

        return "redirect:/Material/queryMaterial";
    }


}
