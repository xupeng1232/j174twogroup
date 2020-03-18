package test;
import com.project.bean.UserBean;
import com.project.tool.HSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class UserTest {

    //@Test
    public void test1(){
        System.out.println(HSession.reateSession());
    }

    @Test
    public void add(){
        Session session = HSession.reateSession();
        Transaction tr = session.getTransaction();
        tr.begin();

        UserBean user = new UserBean();
        user.setId(1);
        user.setName("丽丽");
        user.setPass("777");
        user.setAge(20);

        session.save(user);

        tr.commit();
        session.close();
    }


    //@Test
    public void update(){
        Session session = HSession.reateSession();
        Transaction tr = session.getTransaction();
        tr.begin();

        UserBean user = session.get(UserBean.class, 1);
        user.setPass("666");

        tr.commit();
        session.close();
    }


    //@Test
    public void find(){
        Session session = HSession.reateSession();
        UserBean user = session.get(UserBean.class, 1);
        System.out.println(user.getName());

        session.close();
    }


    //@Test
    public void delete(){
        Session session = HSession.reateSession();
        Transaction tr = session.getTransaction();
        tr.begin();

        UserBean user = session.get(UserBean.class, 1);

        session.delete(user);

        tr.commit();
        session.close();
    }

}
