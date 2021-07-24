package com.jd.ut.junit.service.impl;

import com.jd.ut.junit.domain.Outline;
import com.jd.ut.junit.service.OutlineQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class OutlineQueryServiceImpl implements OutlineQueryService {

    @Override
    public List<Outline> queryAllSubOutlineListByPid(Long pid) {
        return new ArrayList<>();
    }


}
