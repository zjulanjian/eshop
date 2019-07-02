package concurrent;


import com.bj186.fms.service.FundService;
import com.bj186.fms.utils.TimeUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring.xml")
public class TestTimeConvert {

    /**
     * 测试时间转换工具
     */
    @Test
    public void test() {
        Timestamp t = new Timestamp(15615648);
        Date tt = new Date(System.currentTimeMillis());
        System.out.println(TimeUtil.secondToTime(tt.toString()));
    }
}
