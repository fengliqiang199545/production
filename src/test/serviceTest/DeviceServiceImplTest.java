package serviceTest;

import cn.com.taiji.domain.Device;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.DeviceService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DeviceServiceImplTest {
    private ApplicationContext applicationContext;
    private DeviceService deviceService;

    @Before
    public void setup(){
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"
                ,"spring/applicationContext-service.xml","spring/springMVC-servlet.xml"});

        deviceService = (DeviceService) applicationContext.getBean("deviceServiceImpl");
    }

    @Test
    public void test_getList() throws Exception{
        Device device = new Device();
        EUDataGridResult  result = deviceService.getList(1,4,device);
        System.out.println(result);
    }

    @Test
    public void test_find() throws Exception{
        List<Device> list = deviceService.find();
        for (Device d:list
             ) {
            System.out.println(d);
        }
    }

    @Test
    public void test_searchDeviceByDeviceId() throws Exception{
        EUDataGridResult result = deviceService.searchDeviceByDeviceId(1,1,"001");

        System.out.println(result);
    }

    @Test
    public void test_searchDeviceByDeviceName() throws Exception{
        EUDataGridResult result = deviceService.searchDeviceByDeviceName(1,1,"官");

        System.out.println(result);
    }

    @Test
    public void test_searchDeviceByDeviceTypeName() throws Exception{
        EUDataGridResult result = deviceService.searchDeviceByDeviceTypeName(1,1,"加工设备");
        System.out.println(result);
    }
}
