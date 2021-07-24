package com.jd.ut.junit.web;

import com.jd.ut.junit.domain.BusinessType;
import com.jd.ut.junit.service.BusinessTypeQueryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/auth/business")
@Slf4j
public class BusinessTypeController {

    @Resource
    private BusinessTypeQueryService businessTypeQueryService;

    @GetMapping("/{id}")
    public BusinessType findBusinessTypeById(@PathVariable Long id) {
        BusinessType businessType = BusinessType.builder()
                .id(id)
                .build();
        return businessTypeQueryService.findBusinessTypeById(businessType);
    }

}
