import com.demo.project.model.dao.TestDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/6/19.
 */
public class DaoTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("spring.xml");
        TestDao dao = con.getBean(TestDao.class);
        List<Map> mapList = dao.selectAll();
        System.out.println(mapList.size());
    }
}
