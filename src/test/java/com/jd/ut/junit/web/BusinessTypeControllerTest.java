package com.jd.ut.junit.web;

import com.jd.ut.junit.JunitApplicationTests;
import com.jd.ut.junit.domain.BusinessType;
import com.jd.ut.junit.service.BusinessTypeQueryService;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;


public class BusinessTypeControllerTest extends JunitApplicationTests {

    @InjectMocks
    private BusinessTypeController businessTypeController;
    @Mock
    private BusinessTypeQueryService businessTypeQueryService;

    @Test
    public void testFindBusinessTypeById() {
        BusinessType businessType = BusinessType.builder()
                .id(1l)
                .build();
        when(businessTypeQueryService.findBusinessTypeById(any())).thenReturn(businessType);
        BusinessType businessTypeRes = businessTypeController.findBusinessTypeById(anyLong());
        Assert.assertSame(businessTypeRes,businessType);
        verify(businessTypeQueryService,times(1)).findBusinessTypeById(any());
    }

}
