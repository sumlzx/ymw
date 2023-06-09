package cn.boot.ymw.cn.pojo;

import java.io.Serializable;

/**
 * (EasybuyProduct)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:01:29
 */
public class Product implements Serializable {
    private static final long serialVersionUID = -45436518711235227L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 价格
     */
    private Float price;
    /**
     * 库存
     */
    private Integer stock;
    /**
     * 分类1
     */
    private Integer categorylevel1id;
    /**
     * 分类2
     */
    private Integer categorylevel2id;
    /**
     * 分类3
     */
    private Integer categorylevel3id;
    /**
     * 文件名称
     */
    private String filename;
    /**
     * 是否删除(1：删除 0：未删除)
     */
    private Integer isdelete;


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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getCategorylevel1id() {
        return categorylevel1id;
    }

    public void setCategorylevel1id(Integer categorylevel1id) {
        this.categorylevel1id = categorylevel1id;
    }

    public Integer getCategorylevel2id() {
        return categorylevel2id;
    }

    public void setCategorylevel2id(Integer categorylevel2id) {
        this.categorylevel2id = categorylevel2id;
    }

    public Integer getCategorylevel3id() {
        return categorylevel3id;
    }

    public void setCategorylevel3id(Integer categorylevel3id) {
        this.categorylevel3id = categorylevel3id;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

}

