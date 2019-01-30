package ServiceTest;

import cn.com.taiji.domain.Department;
import cn.com.taiji.service.DepartmentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DepartmentServiceImplTest {
    private ApplicationContext applicationContext;

    private DepartmentService departmentService;

    @Before
    public void setup() throws Exception{
        applicationContext = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-dao.xml"
                ,"spring/applicationContext-service.xml","spring/springMVC-servlet.xml"});

        departmentService = (DepartmentService) applicationContext.getBean("departmentServiceImpl");
    }

    @Test
    public void find() throws Exception{
        List<Department> list = departmentService.find();

        for (Department d:list
             ) {
            System.out.println(d);
        }
    }

    @Test
    public void getList() throws Exception{
        System.out.println(departmentService.getList(1,1,new Department()));
    }

    @Test
    public void get() throws Exception{
        System.out.println(departmentService.get("001"));
    }

    @Test
    public void insert() throws Exception{
        Department department = new Department();

        department.setDepartmentId("011");
        department.setDepartmentName("行业支持部");
        department.setNote("冯理强的行业支持部");
        System.out.println(departmentService.insert(department));
    }

    @Test
    public void delete() throws Exception{
        System.out.println(departmentService.delete("010"));
    }

    @Test
    public void deleteBatch() throws Exception{
        System.out.println(departmentService.deleteBatch(new String[]{"008","009"}));
    }

    @Test
    public void update() throws  Exception{
        Department department = new Department();
        department.setDepartmentId("010");
        department.setDepartmentName("能源行业支持部");

        System.out.println(departmentService.update(department));
    }

    @Test
    public void updateAll() throws Exception{
        Department department = new Department();
        department.setDepartmentId("010");
        department.setDepartmentName("基础能源行业支持部SBU");

        System.out.println(departmentService.updateAll(department));
    }

    @Test
    public void updateNote() throws Exception{
        Department department = new Department();
        department.setDepartmentId("009");
        //department.setDepartmentName("基础能源行业支持部SBU");
        department.setNote("日交付时间福建省考福建省附近的老师 ");

        departmentService.updateNote(department);
    }
}
