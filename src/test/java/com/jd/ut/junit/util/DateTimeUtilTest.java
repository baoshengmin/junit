package com.jd.ut.junit.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class DateTimeUtilTest {

    @Test(expected = RuntimeException.class)
    public void testFormatDate0(){
        DateTimeUtil.formatDate(null,null);
    }

    @Test
    public void testFormatDate1(){
        String dataStr = DateTimeUtil.formatDate(new Date(),DateTimeUtil.DATE_TIME_FORMAT);
        Assert.assertNotNull(dataStr);
    }

}
