package cn.tcmp.Document.service;

import cn.tcmp.entity.Document_type_table;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface DocumentService {
    //查询单个材料时期下所有的文档类型
    List<Document_type_table> queryDocumentById(Integer id);

    //修改文档类型
    int updateDocument(Document_type_table document_type_table);

    //增加文档类型
    int addDocument(Document_type_table document_type_table);
}
