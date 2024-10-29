package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 挂号人员
 *
 * @author 
 * @email
 */
@TableName("guahaorenyuan")
public class GuahaorenyuanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GuahaorenyuanEntity() {

	}

	public GuahaorenyuanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 挂号人员姓名
     */
    @TableField(value = "guahaorenyuan_name")

    private String guahaorenyuanName;


    /**
     * 挂号人员手机号
     */
    @TableField(value = "guahaorenyuan_phone")

    private String guahaorenyuanPhone;


    /**
     * 挂号人员身份证号
     */
    @TableField(value = "guahaorenyuan_id_number")

    private String guahaorenyuanIdNumber;


    /**
     * 挂号人员头像
     */
    @TableField(value = "guahaorenyuan_photo")

    private String guahaorenyuanPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：挂号人员姓名
	 */
    public String getGuahaorenyuanName() {
        return guahaorenyuanName;
    }


    /**
	 * 获取：挂号人员姓名
	 */

    public void setGuahaorenyuanName(String guahaorenyuanName) {
        this.guahaorenyuanName = guahaorenyuanName;
    }
    /**
	 * 设置：挂号人员手机号
	 */
    public String getGuahaorenyuanPhone() {
        return guahaorenyuanPhone;
    }


    /**
	 * 获取：挂号人员手机号
	 */

    public void setGuahaorenyuanPhone(String guahaorenyuanPhone) {
        this.guahaorenyuanPhone = guahaorenyuanPhone;
    }
    /**
	 * 设置：挂号人员身份证号
	 */
    public String getGuahaorenyuanIdNumber() {
        return guahaorenyuanIdNumber;
    }


    /**
	 * 获取：挂号人员身份证号
	 */

    public void setGuahaorenyuanIdNumber(String guahaorenyuanIdNumber) {
        this.guahaorenyuanIdNumber = guahaorenyuanIdNumber;
    }
    /**
	 * 设置：挂号人员头像
	 */
    public String getGuahaorenyuanPhoto() {
        return guahaorenyuanPhoto;
    }


    /**
	 * 获取：挂号人员头像
	 */

    public void setGuahaorenyuanPhoto(String guahaorenyuanPhoto) {
        this.guahaorenyuanPhoto = guahaorenyuanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Guahaorenyuan{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", guahaorenyuanName=" + guahaorenyuanName +
            ", guahaorenyuanPhone=" + guahaorenyuanPhone +
            ", guahaorenyuanIdNumber=" + guahaorenyuanIdNumber +
            ", guahaorenyuanPhoto=" + guahaorenyuanPhoto +
            ", sexTypes=" + sexTypes +
            ", createTime=" + createTime +
        "}";
    }
}
