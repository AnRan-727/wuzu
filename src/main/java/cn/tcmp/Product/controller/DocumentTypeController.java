package cn.tcmp.Product.controller;

import cn.tcmp.Product.service.DocumentTypeService;
import cn.tcmp.entity.Document_type_table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("Document")
public class DocumentTypeController {
    @Autowired
    private DocumentTypeService service;

    @RequestMapping("queryAll")
    public String queryAll(Model model) {
        model.addAttribute("list", service.queryAll());
        return "ChanPinGuanLi/FuJianXinXi";
    }

    @RequestMapping("detail")
    public String detail(Integer id, Model model) {
        model.addAttribute("detail", service.detail(id));
        return "ChanPinGuanLi/XiuGaiFuJian";
    }

    @RequestMapping("doUpdate")
    public String doUpdate(Document_type_table document_type_table, Model model) {
        int count=service.updateDocument(document_type_table);
        return "redirect:queryAll";
    }

    @RequestMapping("addDocument")
    public String addDocument() {
        return "ChanPinGuanLi/TianJiaFuJian";
    }

    @RequestMapping("doAddDocument")
    public String doAddDocument(Document_type_table document_type_table, Model model) {
        model.addAttribute("doAdd", service.addDocument(document_type_table));
        return "redirect:queryAll";
    }
    @RequestMapping("delete")
    public String delete(Integer id, Model model) {
        model.addAttribute("delete",service.deleteDocument(id));
        return "redirect:queryAll";
    }
}
