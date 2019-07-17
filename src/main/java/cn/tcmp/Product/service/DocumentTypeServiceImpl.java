package cn.tcmp.Product.service;

import cn.tcmp.Product.mapper.DocumentTypeMapper;
import cn.tcmp.entity.Document_type_table;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {
    @Resource
    private DocumentTypeMapper mapper;
    @Override
    public List<Document_type_table> queryAll() {
        return mapper.queryAll();
    }

    @Override
    public Integer addDocument(Document_type_table document_type_table) {
        return mapper.addDocument(document_type_table);
    }

    @Override
    public Document_type_table detail(Integer id) {
        return mapper.detail(id);
    }

    @Override
    public Integer updateDocument(Document_type_table document_type_table) {
        return mapper.updateDocument(document_type_table);
    }

    @Override
    public Integer deleteDocument(Integer id) {
        return mapper.deleteDocument(id);
    }
}
