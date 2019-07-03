package cn.tcmp.Document.controller;

import cn.tcmp.Document.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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





}
