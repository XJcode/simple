package com.xj.simple.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author xj
 * @since 2021-10-31
 */
@Getter
@Setter
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 登录账号
     */
    private String loginName;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否删除1删除0没有
     */
    private Integer deleted;


}
