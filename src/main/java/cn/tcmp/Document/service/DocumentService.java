package cn.tcmp.Document.service;

import cn.tcmp.entity.Document_type_table;
import cn.tcmp.entity.Push_direction_table;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
public interface DocumentService {
    //查询单个材料时期下所有的文档类型
    PageInfo<Document_type_table> queryDocumentById(Integer id, Integer pageNum, Integer pageSize);

    //查询单个文档类型
    Document_type_table queryDocumentByDocumentId(Integer id);

    //修改文档类型
    int updateDocument(Document_type_table document_type_table);

    //增加文档类型
    int addDocument(Document_type_table document_type_table);

    //删除文档类型
    int deleteDocument(Integer id);

    //查询所有的材料时期推送方向
    List<Push_direction_table> queryAllPush();
}
