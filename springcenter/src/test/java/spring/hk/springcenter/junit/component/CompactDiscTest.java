package spring.hk.springcenter.junit.component;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.hk.springcenter.component.CompactDisc;

@RunWith( SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CompactDiscTest
{
    @Autowired
    private CompactDisc disc;
    
    
    @Test
    public void discShouldNotNull(){
        assertNotNull(disc);
    }
}
