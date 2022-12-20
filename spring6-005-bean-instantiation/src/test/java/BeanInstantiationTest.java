import com.powernode.spring6.bean.SpringBean;
import com.powernode.spring6.bean.Star;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName : BeanInstantiationTest
 * @Author : longZai
 * @Date : 2022/12/8 1:15
 */
public class BeanInstantiationTest {
    @Test
    public void testInstantiation2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Star star = applicationContext.getBean("starBean", Star.class);
        System.out.println(star);
    }


    @Test
    public void testInstantiation1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        SpringBean springBean = applicationContext.getBean("springBean", SpringBean.class);
        System.out.println(springBean);
    }
}
