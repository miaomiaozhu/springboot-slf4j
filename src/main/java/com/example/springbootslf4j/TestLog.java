package com.example.springbootslf4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName TestLog
 * @Author Jumy
 * @Description //TODO
 * @Date 2019/6/10 10:46
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes= SpringbootSlf4jApplication.class)
public class TestLog {
    Logger logger = LoggerFactory.getLogger(TestLog.class);
    @Test
    public void  testLog(){
        logger.info("----Hello World----");
    }
}
