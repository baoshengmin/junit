package com.jd.ut.junit.service;

import com.jd.ut.junit.domain.Outline;

import java.util.List;

public interface OutlineQueryService {

    List<Outline> queryAllSubOutlineListByPid(Long pid);

}
