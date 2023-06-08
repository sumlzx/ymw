package cn.boot.ymw.cn.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * (EasybuyOrder)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:00:01
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 745101872130720294L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 用户主键
     */
    private Integer userid;
    
    private String loginname;
    /**
     * 用户地址
     */
    private String useraddress;
    /**
     * 创建时间
     */
    private Date createtime;
    /**
     * 总消费
     */
    private Float cost;
    /**
     * 订单号
     */
    private String serialnumber;


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

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

}

