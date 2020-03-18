package test;

import com.project.bean.OrderBean;
import com.project.service.IOrderService;
import com.project.service.IProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class OrderTest {

    @Autowired
    private IOrderService Oservice;

    @Autowired
    private IProductService Pservice;

    @Test
    public void test(){
        OrderBean order = new OrderBean(3, 10);
        Oservice.add(order);
        //System.out.println(order.getId());
        //Oservice.update();
        Pservice.update(3, 1);


    }


}
