package com.jsee.gona.demo;

import com.jsee.gona.demo.controller.CustomerController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private MockMvc mvc;

    @Before
    public void setUp(){
        mvc = MockMvcBuilders.standaloneSetup(new CustomerController()).build();
    }

    @Test
    public void contextLoads() {

    }

}
