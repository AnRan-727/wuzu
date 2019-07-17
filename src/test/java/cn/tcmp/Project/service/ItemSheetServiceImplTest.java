package cn.tcmp.Project.service;

import cn.tcmp.Product.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by IntelliJ IDEA.
 * User: AnRan
 * Date: 2019/7/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ItemSheetServiceImplTest {

    @Resource
    private ItemSheetService itemSheetService;
    @Resource
    private ProductService productService;


    @Test
    public void queryItemSheetByTypeId() {
        System.out.println(itemSheetService.queryItemSheetByTypeId(3));
    }

    @Test
    public void queryItemSheetByTypeIda() {
        System.out.println(productService.queryMaxProductCode());
    }
    @Test
    public void queryItemSheetByTypeIdaa() {
        System.out.println(itemSheetService.detailItem_sheet(4));
    }
}