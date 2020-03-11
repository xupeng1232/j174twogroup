import com.project.entity.InfoEntity;
import com.project.entity.UserEntity;
import com.project.service.IInfoService;
import com.project.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class MyTest {
    @Autowired
    private IUserService userService;
    @Autowired
    private IInfoService infoService;
    @Test
    public void test(){
//        System.out.println(userService.register(new UserEntity("wangwu","1215",15)));
//        infoService.addInfo(new InfoEntity("经理",20000,3));
        System.out.println(infoService.findInfoByUserId(2));
    }
}
