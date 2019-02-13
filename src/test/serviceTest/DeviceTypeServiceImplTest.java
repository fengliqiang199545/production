package serviceTest;

import cn.com.taiji.domain.DeviceType;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.DeviceTypeService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DeviceTypeServiceImplTest {
    private ApplicationContext applicationContext;
    private DeviceTypeService deviceTypeService;

    @Before
    public void setup() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"
                ,"spring/applicationContext-service.xml","spring/springMVC-servlet.xml"});

        deviceTypeService = (DeviceTypeService) applicationContext.getBean("deviceTypeServiceImpl");
    }

    @Test
    public void test_getList() throws Exception{
        DeviceType deviceType = new DeviceType();
        EUDataGridResult result = deviceTypeService.getList(1,1,deviceType);
        System.out.println(result);
    }

    @Test
    public void test_get() throws Exception{
        System.out.println(deviceTypeService.get("0123"));
    }

    @Test
    public void test_insert() throws Exception{
        DeviceType deviceType = new DeviceType();
        deviceType.setDeviceTypeId("96");
        deviceType.setDeviceTypeName("高压充数2222");
        System.out.println(deviceTypeService.insert(deviceType));

    }

    @Test
    public void test_deleteBatch() throws Exception{
        CustomResult result = deviceTypeService.deleteBatch(new String[]{"95","96"});
        System.out.println(result);
    }
}
