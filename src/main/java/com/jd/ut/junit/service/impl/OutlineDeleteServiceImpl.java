package com.jd.ut.junit.service.impl;

import com.jd.ut.junit.dao.OutlineMapper;
import com.jd.ut.junit.domain.Outline;
import com.jd.ut.junit.service.OutlineDeleteService;
import com.jd.ut.junit.service.OutlineQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class OutlineDeleteServiceImpl implements OutlineDeleteService {

    @Resource
    private OutlineMapper cfgOutlineMapper;

    @Resource
    private OutlineQueryService cfgOutlineGetService;

    @Override
    public Integer deleteCascading(Outline entity) {
        //删除所有子节点
        List<Outline> outlines = cfgOutlineGetService.queryAllSubOutlineListByPid(entity.getId());
        if(outlines != null && outlines.size() > 0){
            for(Outline outline : outlines){
                int successRow = cfgOutlineMapper.delete(outline);
                if (1 != successRow) {
                    log.error("删除数据异常！");
                    throw new RuntimeException("删除数据异常！");
                }
            }
        }
        //删除实体
        int successRow = cfgOutlineMapper.delete(entity);
        if (1 != successRow) {
            log.error("删除数据异常！");
            throw new RuntimeException("删除数据异常！");
        }
        return outlines == null ? 1 : outlines.size() +1;
    }

}
