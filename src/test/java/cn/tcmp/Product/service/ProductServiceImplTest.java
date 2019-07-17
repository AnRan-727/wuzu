package cn.tcmp.Product.service;

import cn.tcmp.entity.Product_list;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {
    @Autowired
    private ProductService productService;


    @Test
    public void aaa(){
        PageInfo<Product_list> product_listPageInfo = productService.queryAll(new Product_list(),1,8);
        for (Product_list list : product_listPageInfo.getList()) {
            System.out.println(list);
        }
        System.out.println();
    }

}