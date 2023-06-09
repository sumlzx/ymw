package cn.boot.ymw.cn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (UserAddress)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:02:04
 */
public class UserAddress implements Serializable {
    private static final long serialVersionUID = -89702187314869066L;
    /**
     * 主键id
     */
    private Integer id;
    /**
     * 用户主键
     */
    private Integer userid;
    /**
     * 地址
     */
    private String address;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 是否是默认地址（1:是 0否）
     */
    private Integer isdefault;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIsdefault() {
        return isdefault;
    }

    public void setIsdefault(Integer isdefault) {
        this.isdefault = isdefault;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}

