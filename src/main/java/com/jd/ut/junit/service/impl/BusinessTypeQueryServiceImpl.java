package com.jd.ut.junit.service.impl;

import com.jd.ut.junit.domain.BusinessType;
import com.jd.ut.junit.service.BusinessTypeQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class BusinessTypeQueryServiceImpl implements BusinessTypeQueryService {

    @Override
    public BusinessType findBusinessTypeById(BusinessType businessType) {
        return new BusinessType();
    }


}
