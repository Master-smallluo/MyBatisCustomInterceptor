package org.sanqi.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author: JenSen
 * @Date: 2024/4/17 16:21
 * @Description: User
 */

/**
 * 用户
 */
@Data
@TableName(value = "`user`")
public class User implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号
     */
    @TableField(value = "userAccount")
    private String useraccount;

    /**
     * 用户名
     */
    @TableField(value = "username")
    private String username;

    /**
     * 头像地址
     */
    @TableField(value = "avatarUrl")
    private String avatarurl;

    /**
     * 性别
     */
    @TableField(value = "gender")
    private Byte gender;

    @TableField(value = "tag")
    private String tag;

    @TableField(value = "userProfile")
    private String userprofile;

    /**
     * 手机
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 密码
     */
    @TableField(value = "userPassword")
    private String userpassword;

    /**
     * 用户状态 0-正常
     */
    @TableField(value = "userStatus")
    private Integer userstatus;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private Date createtime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private Date updatetime;

    /**
     * 是否删除 默认0正常
     */
    @TableField(value = "isDelete")
    private Byte isdelete;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    private String email;

    /**
     * 角色
     */
    @TableField(value = "userRole")
    private Integer userrole;

    /**
     * 编号
     */
    @TableField(value = "planetCode")
    private String planetcode;

    private static final long serialVersionUID = 1L;
}