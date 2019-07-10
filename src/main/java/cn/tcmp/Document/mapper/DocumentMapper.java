package cn.tcmp.Document.mapper;

import cn.tcmp.entity.Document_type_table;
import cn.tcmp.entity.Push_direction_table;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/27
 * 文档类型
 */

public interface DocumentMapper {

    //查询单个材料时期下所有的文档类型
    List<Document_type_table> queryDocumentById(Integer id);

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
