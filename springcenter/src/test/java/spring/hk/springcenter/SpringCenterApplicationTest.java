package spring.hk.springcenter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author I323691
 *
 */
//@RunWith(SpringRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringCenterApplication.class)
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@WebAppConfiguration
public class SpringCenterApplicationTest
{
    @Test
    public void contextLoads() {
    }
}
