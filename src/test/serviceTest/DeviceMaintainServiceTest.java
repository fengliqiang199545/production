package serviceTest;

import cn.com.taiji.domain.DeviceMaintain;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.DeviceMaintainService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeviceMaintainServiceTest {
    private ApplicationContext applicationContext;
    private DeviceMaintainService deviceMaintainService;
    @Before
    public void setup() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"
                ,"spring/applicationContext-service.xml","spring/springMVC-servlet.xml"
        });

        deviceMaintainService = (DeviceMaintainService) applicationContext.getBean("deviceMaintainServiceImpl");
    }

    @Test
    public void getList() throws Exception{
        EUDataGridResult result = new EUDataGridResult();
        result = deviceMaintainService.getList(1,1,new DeviceMaintain());

        System.out.println(result);
    }
}
