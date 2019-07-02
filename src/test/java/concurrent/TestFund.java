package concurrent;


import com.bj186.fms.service.FundService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
}
