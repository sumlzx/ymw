package cn.boot.ymw.cn.pojo;

import java.io.Serializable;

/**
 * (EasybuyProductCategory)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:01:43
 */
public class ProductCategory implements Serializable {
    private static final long serialVersionUID = -15366885495460507L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 父级目录id
     */
    private Integer parentid;
    /**
     * 级别(1:一级 2：二级 3：三级)
     */
    private Integer type;
    /**
     * 图标
     */
    private String iconclass;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIconclass() {
        return iconclass;
    }

    public void setIconclass(String iconclass) {
        this.iconclass = iconclass;
    }

}

