import cn.com.taiji.domain.Custom;
import cn.com.taiji.domain.CustomExample;
import cn.com.taiji.domain.DeviceExample;
import cn.com.taiji.mapper.CustomMapper;
import cn.com.taiji.mapper.DeviceMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class TestPageHelper {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml","spring/springMVC-servlet.xml"});

         CustomMapper costomMapper = (CustomMapper) applicationContext.getBean("customMapper");

        CustomExample customExample = new CustomExample();

        PageHelper.startPage(2,2);

         List<Custom> list =  costomMapper.selectByExample(customExample);

        for (Custom c:list
             ) {
            System.out.println(c);
        }

        PageInfo<Custom> pageInfo = new PageInfo<Custom>(list);

        System.out.println(pageInfo.getTotal());
    }
}
