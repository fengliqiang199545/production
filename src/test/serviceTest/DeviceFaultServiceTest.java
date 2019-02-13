package serviceTest;

import cn.com.taiji.domain.DeviceFault;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.DeviceFaultService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DeviceFaultServiceTest {
    private ApplicationContext applicationContext;

    private DeviceFaultService deviceFaultService;

    @Before
    public void setup() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"
                ,"spring/applicationContext-service.xml","spring/springMVC-servlet.xml"
        });

        deviceFaultService = (DeviceFaultService) applicationContext.getBean("deviceFaultServiceImpl");
    }

    @Test
    public void find() throws Exception{
        EUDataGridResult result = new EUDataGridResult();
        DeviceFault deviceFault = new DeviceFault();

        deviceFault.setDeviceFaultId("001");
        result  =  deviceFaultService.getList(1,1,deviceFault);

        System.out.println(result);


    }

    @Test
    public void getData() throws Exception{
            List<DeviceFault> list = deviceFaultService.find();
        for (DeviceFault d:list
             ) {
            System.out.println(d);
        }
    }
}
