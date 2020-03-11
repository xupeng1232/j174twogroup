import com.project.bean.UserBean;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.project.service.IUserService;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class Test {

    @Resource
    private IUserService service;

    @org.junit.Test
    public  void te(){
//        System.out.println(service.findByName());
//        service.add(new UserBean("add测试","123",1));
        System.out.println(service.getUserByName("ww"));;
    }

}
