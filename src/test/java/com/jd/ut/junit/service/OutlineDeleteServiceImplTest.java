package com.jd.ut.junit.service;

import com.jd.ut.junit.JunitApplicationTests;
import com.jd.ut.junit.dao.OutlineMapper;
import com.jd.ut.junit.domain.Outline;
import com.jd.ut.junit.service.impl.OutlineDeleteServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

public class OutlineDeleteServiceImplTest extends JunitApplicationTests {

    @InjectMocks
    private OutlineDeleteServiceImpl outlineDeleteService;
    @Mock
    private OutlineQueryService cfgOutlineGetService;
    @Mock
    private OutlineMapper cfgOutlineMapper;

    @Test
    public void testDeleteCascading0(){
        when(cfgOutlineGetService.queryAllSubOutlineListByPid(anyLong())).thenReturn(null);
        when(cfgOutlineMapper.delete(any(Outline.class))).thenReturn(1);
        Outline param = new Outline();
        int result = outlineDeleteService.deleteCascading(param);
        Assert.assertEquals(1,result);
    }

    @Test
    public void testDeleteCascading1(){
        Outline outline = new Outline();
        outline.setId(1l);
        List<Outline> outlines = Stream.of(outline).collect(Collectors.toList());
        when(cfgOutlineGetService.queryAllSubOutlineListByPid(1l)).thenReturn(outlines);
        when(cfgOutlineMapper.delete(outline)).thenReturn(1);
        int result = outlineDeleteService.deleteCascading(outline);
        Assert.assertEquals(2,result);
    }

}
