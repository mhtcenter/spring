package spring.hk.springcenter.springboottest.component;

import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import spring.hk.springcenter.component.CompactDisc;

@RunWith( SpringRunner.class )
@SpringBootTest
@AutoConfigureMockMvc
public class CompactDiscTest
{
    private CompactDisc disc;
}
