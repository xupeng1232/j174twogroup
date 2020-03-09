package test;

import com.project.bean.StudentBean;
import com.project.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class StudentTest {

    @Resource
    private IStudentService service;

    @Test
    public void testAdd(){
//        service.add(new StudentBean("nh","1615651"));
        //service.findAll();
//        System.out.println("aaa");
//        service.delStu(10);
//        service.updateStud(1,"156","156");
//        service.findName("188");
    }
}
