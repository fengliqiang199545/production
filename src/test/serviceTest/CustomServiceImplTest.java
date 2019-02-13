package serviceTest;

import cn.com.taiji.domain.Custom;
import cn.com.taiji.domain.customize.CustomResult;
import cn.com.taiji.domain.customize.EUDataGridResult;
import cn.com.taiji.service.CustomService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class CustomServiceImplTest {
    private ApplicationContext applicationContext;
    private CustomService customService;
    @Before
    public void setup() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"
        ,"spring/applicationContext-service.xml","spring/springMVC-servlet.xml"
        });

        customService = (CustomService) applicationContext.getBean("customServiceImpl");
    }

    @Test
    public void find() throws Exception{

        List<Custom> list = customService.find();
        for (Custom c:list
             ) {
            System.out.println(c);
        }
    }

    @Test
    public void getList() throws Exception{
        Custom custom = new Custom();
        EUDataGridResult result =  customService.getList(2,3,custom);

        System.out.println(result);
    }

    @Test
    public void get() throws Exception{
        Custom custom =  customService.get("001");
        System.out.println(custom);
    }

    @Test
    public void insert() throws Exception{
        Custom custom = new Custom();
        custom.setCustomId("111");
        custom.setCustomName("fengliqiang");
        custom.setAddress("taiji");
        custom.setNote("这是第一家公司");

        CustomResult result =  customService.insert(custom);

        System.out.println(result);
    }

    @Test
    public void delete() throws Exception{
        CustomResult result =  customService.delete("111");
        System.out.println(result);
    }

    @Test
    public void deleteBatch()throws Exception{
        CustomResult result =  customService.deleteBatch(new String[]{"111","112","113","114","115"});

        System.out.println(result);
    }

    @Test
    public void update()throws Exception{
        Custom custom = new Custom();
        custom.setCustomId("111");
        custom.setCustomName("fengliqiang2");

        CustomResult result =  customService.update(custom);

        System.out.println(result);
    }

    @Test
    public void updateAll() throws Exception{
        Custom custom = new Custom();
        custom.setCustomId("111");
        custom.setCustomName("fengliqiang2");
        custom.setAddress("北京太极计算机有限公司");
        custom.setEmail("flq@gmail.com");

        CustomResult result = customService.updateAll(custom);

        System.out.println(result);
    }

    @Test
    public void updateNote()throws Exception{
        Custom custom = new Custom();
        custom.setCustomId("111");
        custom.setNote("更新客户介绍！！！");

        CustomResult result = customService.updateAll(custom);

        System.out.println(result);
    }

    @Test
    public void changeStatus() throws Exception{
        customService.changeStatus(new String[]{"111","1253"});
    }

    @Test
    public void searchCustomByCustomName() throws Exception{
       EUDataGridResult result = customService.searchCustomByCustomName(1,1,"fengliqiang33");
        System.out.println(result);
    }

    @Test
    public void searchCustomByCustomId() throws Exception{
        EUDataGridResult result = customService.searchCustomByCustomId(1,1,"001");
        System.out.println(result);
    }
}
