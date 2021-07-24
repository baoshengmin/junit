package com.jd.ut.junit.dao;

import com.jd.ut.junit.JunitApplicationTests;
import com.jd.ut.junit.domain.Outline;
import org.apache.ibatis.annotations.Mapper;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;


public class OutlineMapperTest extends JunitApplicationTests {

    @Resource
    private OutlineMapper cfgOutlineMapper;

    @Test
    public void testDelete(){
        Outline outline = new Outline();
        outline.setId(666L);
        int deleteRow = cfgOutlineMapper.delete(outline);
        Assert.assertEquals(1,deleteRow);
    }

}
