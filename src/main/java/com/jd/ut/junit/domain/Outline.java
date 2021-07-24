package com.jd.ut.junit.domain;


import lombok.Data;

@Data
public class Outline {

    private static final long serialVersionUID = 2232155454204992332L;

    /**
     * ID
     */
    private Long id;

    /**
     * 父ID
     */
    private Long pid;

    /**
     * 概要名称
     */
    private String name;

    /**
     * 默认0为第一级
     */
    private Integer olevel;

    /**
     * 是否为末级概要
     */
    private Boolean isLeaf;

    private String opath;

    /**
     * 控制是否展示--1启用/0停用
     */
    private Integer status;

    /**
     * 概要关闭时长限制 默认0
     */
    private Integer closeTimeLimit;

    /**
     * 排列顺序
     */
    private Integer sn;

    /**
     *业务类型 10 用户纠纷 11 商家纠纷
     * */
    private Integer businessType;


}
