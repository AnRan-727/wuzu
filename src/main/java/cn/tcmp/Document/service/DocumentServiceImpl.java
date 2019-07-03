package cn.tcmp.Document.service;

import cn.tcmp.Document.mapper.DocumentMapper;
import cn.tcmp.entity.Document_type_table;
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
    public List<Document_type_table> queryDocumentById(Integer id) {
        return documentMapper.queryDocumentById(id);
    }

    @Override
    public int updateDocument(Document_type_table document_type_table) {
        return documentMapper.updateDocument(document_type_table);
    }

    @Override
    public int addDocument(Document_type_table document_type_table) {
        return documentMapper.addDocument(document_type_table);
    }

}
