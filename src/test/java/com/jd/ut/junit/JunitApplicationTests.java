package com.jd.ut.junit;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.MockitoAnnotations.openMocks;
@RunWith(SpringRunner.class)
@SpringBootTest
public class JunitApplicationTests {

    @Before
    public void setUp(){
        openMocks(this);
    }

    @Test
    public void contextLoads() {
    }

}
