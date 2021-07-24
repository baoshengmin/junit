package com.jd.ut.junit.dao;

import com.jd.ut.junit.domain.Outline;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OutlineMapper {

    int delete(Outline outline);

}
