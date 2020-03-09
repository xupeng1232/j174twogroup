package project;

import com.project.entity.UserEntity;
import com.project.service.IUserService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserTest {


    @Test
    public  void t() {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        List<UserEntity> userBeanList = userService.findAll("张");
        for (UserEntity user:userBeanList
             ) {
            System.out.println("id"+user.getId()+" 名字："+user.getUserName()+" 密码："+user.getPassword()+" 年龄："+user.getAge());
        }
    }
}
