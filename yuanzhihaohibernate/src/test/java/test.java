import com.project.entity.StudentEntity;
import com.project.entity.TeacherEntity;
import com.project.entity.TeacherWithStudent;
import com.project.util.HSession;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class test {
    @Test
    public void t(){
        System.out.println(HSession.createSession());
    }

    Session session = null;
    Transaction tr= null;
    @Before
    public  void before(){
        session= HSession.createSession();
        tr= session.getTransaction();
        tr.begin();
    }

    @After
    public void after(){
        tr.commit();
        session.close();
    }

    @Test
    public void testManyToMany(){
        TeacherEntity t = new TeacherEntity();
        StudentEntity s = new StudentEntity();
        TeacherWithStudent ts = new TeacherWithStudent();

        t.setTeacherName("测试老师");
        t.setTeacherClass("测试班级");
        s.setStudentName("测试学生");

        ts.setStudent(s);
        ts.setTeacher(t);

        session.save(ts);

    }


}
