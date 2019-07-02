package concurrent;


import com.bj186.fms.service.FundService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring.xml")
public class TestFund {

    @Autowired
    private FundService fundService;

    @Test
    public void testFundSelectAll() {
        //System.out.println("所有基金: " + fundService.selectAll());
        System.out.println(fundService);
    }
    @Test
    public void testFundOrder() {
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("userID",1);
        paramMap.put("fundID",1);
        paramMap.put("amount",1000);
        //向数据库中插入一条订单
        fundService.insertUserFundOrder(paramMap);
        int fundOrderID = fundService.selectOrderByUserID(1);
        System.out.println(fundOrderID);
    }
}
