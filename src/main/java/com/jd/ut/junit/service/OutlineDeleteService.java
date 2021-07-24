package com.jd.ut.junit.service;

import com.jd.ut.junit.domain.Outline;

public interface OutlineDeleteService {

    Integer deleteCascading(Outline entity);

}
