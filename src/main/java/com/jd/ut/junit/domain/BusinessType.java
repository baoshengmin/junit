package com.jd.ut.junit.domain;

import lombok.*;

import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode()
public class BusinessType implements Serializable {

    private static final long serialVersionUID = 3594601704634083562L;
    /**
     * 系统类型编码
     */
    private Integer systemKey;
    /**
     * 系统类型名称
     */
    private String systemName;
    /**
     * 业务类型编码
     */
    private Integer businessTypeKey;
    /**
     * 业务类型名称
     */
    private String businessTypeName;
    /**
     * 是否允许删除
     */
    private Integer isAllowDelete;

    /**
     * 父ID
     */
    private Long pid;

    @Builder

    public BusinessType(Long id, String createUser, Date createTime, String updateUser, Date updateTime, Integer sysVersion, Boolean isDelete, Integer systemKey, String systemName, Integer businessTypeKey, String businessTypeName, Integer isAllowDelete, Long pid) {
        this.systemKey = systemKey;
        this.systemName = systemName;
        this.businessTypeKey = businessTypeKey;
        this.businessTypeName = businessTypeName;
        this.isAllowDelete = isAllowDelete;
        this.pid = pid;
    }
}
