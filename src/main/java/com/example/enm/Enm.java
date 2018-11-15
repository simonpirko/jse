package com.example.enm;

import org.junit.Test;

import static org.apache.log4j.Logger.getRootLogger;

public class Enm {

    @Test
    public void testEntityEnmForGetValue() {
        EntityEnm one = EntityEnm.ONE;
        EntityEnm two = EntityEnm.valueOf("TWO");
        getRootLogger().info(one.name());
        getRootLogger().info(one.toString());
        getRootLogger().info(two.name());
        getRootLogger().info(EntityEnm.THREE);
    }
}
