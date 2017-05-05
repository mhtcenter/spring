package spring.hk.springcenter.junit.component;

import static org.junit.Assert.assertNotNull;

import org.eclipse.persistence.internal.jpa.DataSourceConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.hk.springcenter.component.CompactDisc;

@RunWith( SpringJUnit4ClassRunner.class)
//@SpringBootTest
//@SpringBootTest(classes = DataSourceConfig.class
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class CompactDiscTest
{
    @Autowired
    private CompactDisc disc;
    
    
    @Autowired
    @Qualifier("primaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;
    
    @Autowired
    @Qualifier("secondaryJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;
    
    @Test
    public void discShouldNotNull(){
        assertNotNull(disc);
//        assertNotNull(jdbcTemplate1);
    }
}
