import com.project.bean.StudentBean;
import com.project.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class StudentTest {
    @Resource
    private IStudentService service;

    @Test
    public void teststu(){
//        System.out.println(service.findAll());
//        service.add(new StudentBean("测试2","电话2"));
//        service.update(11,"修改电话1");
        service.del(12);
    }
}
