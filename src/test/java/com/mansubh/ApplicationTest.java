package com.mansubh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ApplicationTest {


    @Test
    public void applicationContextTest(){
        Application.main(new String[] {});
    }
}

