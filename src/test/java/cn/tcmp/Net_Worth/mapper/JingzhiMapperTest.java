package cn.tcmp.Net_Worth.mapper;

import cn.tcmp.entity.Product_list;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JingzhiMapperTest {

    @Autowired
    private JingzhiMapper mapper;

    @Test
    public  void queryAllPL(){
        List<Product_list> list=mapper.queryAllPL();
        for (Product_list product_list : list) {
            System.out.println(product_list);
        }
    }
    @Test
    public  void queryCpByProductID(){
         Product_list list=mapper.queryCpByProductID(1);
        System.err.println(list);
    }
}