package com.atguigu.mybatisPlus.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    // 全局设置主键生成策略
    // applcation.properties中配置自增长策略 mybatis-plus.global-config.db-config.id-type=auto
    @TableId(type = IdType.AUTO) // 主键自增长
    private Long id;
    private String name;
    private Integer age;
    private String email;

    // FieldFill.DEFAULT 按照默认值自动设置
    // ieldFill.INSERT insert时自动设置
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    // insert和update时自动设置
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

}
