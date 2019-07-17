package cn.tcmp.Product.service;

import cn.tcmp.entity.Document_type_table;

import java.util.List;

public interface DocumentTypeService {
    //查询附件信息
    List<Document_type_table> queryAll();

    //添加附件信息
    Integer addDocument(Document_type_table document_type_table);

    //查询一条附件信息
    Document_type_table detail(Integer id);

    //修改附件信息
    Integer updateDocument(Document_type_table document_type_table);

    //删除附件信息
    Integer deleteDocument(Integer id);
}
