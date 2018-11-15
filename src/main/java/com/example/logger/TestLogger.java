package com.example.logger;

import org.apache.log4j.Logger;

public class TestLogger {
    private Logger log = Logger.getLogger(TestLogger.class);

    public void testMethod(int a){
        if (a < 5){
            log.error("Error!");
        } else if (a > 5){
            log.info("Variable a > 5");
        } else log.warn("Warning!");
    }

    public static void main(String[] args) {
        new TestLogger().testMethod(7);
    }
}
