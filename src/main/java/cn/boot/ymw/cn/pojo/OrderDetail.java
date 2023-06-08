package cn.boot.ymw.cn.pojo;

import java.io.Serializable;

/**
 * (EasybuyOrderDetail)实体类
 *
 * @author makejava
 * @since 2023-06-08 22:01:04
 */
public class OrderDetail implements Serializable {
    private static final long serialVersionUID = 650536334651529152L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 订单主键
     */
    private Integer orderid;
    /**
     * 商品主键
     */
    private Integer productid;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 消费
     */
    private Float cost;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

}

