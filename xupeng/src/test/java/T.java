import com.project.entity.StudentEntity;
import com.project.service.IStudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:application.xml")
public class T {
    @Autowired
    private IStudentService service;
    @Test
    public void test(){
        System.out.println(service.findAll());
//        service.add(new StudentEntity("asdfd","32323"));
//        service.update(1,"99999");
//        service.del(8);
    }

}
