package cn.boot.ymw.cn.pojo;

import java.util.Date;
import java.io.Serializable;

/**
 * (ProductCollection)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:55:26
 */
public class ProductCollection implements Serializable {
    private static final long serialVersionUID = -83434598357242403L;
    /**
     * 收藏id
     */
    private Integer cid;
    /**
     * 用户id
     */
    private Integer uid;
    /**
     * 商品id
     */
    private Integer pid;
    /**
     * 收藏时间
     */
    private Date cDate;


    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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

    public Date getCDate() {
        return cDate;
    }

    public void setCDate(Date cDate) {
        this.cDate = cDate;
    }

}

