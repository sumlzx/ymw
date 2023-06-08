package cn.boot.ymw.cn.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (ProductHistory)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:55:27
 */
public class ProductHistory implements Serializable {
    private static final long serialVersionUID = -13018576068446672L;
    /**
     * 浏览历史商品id
     */
    private Integer hid;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 商品id
     */
    private Integer pid;
    /**
     * 浏览历史创建时间
     */
    private Date hDate;


    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getHDate() {
        return hDate;
    }

    public void setHDate(Date hDate) {
        this.hDate = hDate;
    }

}

