package com.example.Jenkins.Controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleControllerTest {

    private static final Log log = LogFactory.getLog(SampleControllerTest.class);

    @Test
    public void dummyTest(){
        log.info("In Test Method");
        assertEquals("Manoj","Manoj");
    }
}
