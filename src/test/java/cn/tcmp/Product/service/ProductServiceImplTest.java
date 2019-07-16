package cn.tcmp.Product.service;

import cn.tcmp.entity.Attached_table;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;


    @Test
    public void queryAllFuJian() {
        List<Attached_table> attached_tables=productService.queryAllFuJian(null);
        for (Attached_table attached_table : attached_tables) {
            System.out.println(attached_table);
        }
    }
}