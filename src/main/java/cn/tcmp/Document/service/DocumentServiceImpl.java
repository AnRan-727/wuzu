package cn.tcmp.Document.service;

import cn.tcmp.Document.mapper.DocumentMapper;
import cn.tcmp.entity.Document_type_table;
import cn.tcmp.entity.Material_period;
import cn.tcmp.entity.Push_direction_table;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/6/28
 */
@Service
public class DocumentServiceImpl implements DocumentService {

    @Resource
    private DocumentMapper documentMapper;


    @Override
    public PageInfo<Document_type_table> queryDocumentById(Integer id,Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Document_type_table> list = documentMapper.queryDocumentById(id);
        PageInfo<Document_type_table> pageInfo = new PageInfo<Document_type_table>(list);
        return pageInfo;
    }

    @Override
    public Document_type_table queryDocumentByDocumentId(Integer id) {
        return documentMapper.queryDocumentByDocumentId(id);
    }

    @Override
    public int updateDocument(Document_type_table document_type_table) {
        return documentMapper.updateDocument(document_type_table);
    }

    @Override
    public int addDocument(Document_type_table document_type_table) {
        return documentMapper.addDocument(document_type_table);
    }

    @Override
    public int deleteDocument(Integer id) {
        return documentMapper.deleteDocument(id);
    }

    @Override
    public List<Push_direction_table> queryAllPush() {
        return documentMapper.queryAllPush();
    }

}
