package com.atguigu.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class User {

    // #全局设置主键生成策略
    //mybatis-plus.global-config.db-config.id-type=auto
    @TableId(type = IdType.AUTO) // 主键自增长
    private Long id;
    private String name;
    private Integer age;
    private String email;


}
