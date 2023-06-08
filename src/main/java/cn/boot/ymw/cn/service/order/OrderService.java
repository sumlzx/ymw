package cn.boot.ymw.cn.service.order;


import cn.boot.ymw.cn.pojo.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:23:07
 */
public interface OrderService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Order queryById(Integer id);

    /**
     * 分页查询
     *
     * @param order 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Order> queryByPage(Order order, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order insert(Order order);

    /**
     * 修改数据
     *
     * @param order 实例对象
     * @return 实例对象
     */
    Order update(Order order);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
