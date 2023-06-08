package cn.boot.ymw.cn.service.orderDetail;


import cn.boot.ymw.cn.pojo.OrderDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (OrderDetail)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:23:20
 */
public interface OrderDetailService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    OrderDetail queryById(Integer id);

    /**
     * 分页查询
     *
     * @param orderDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<OrderDetail> queryByPage(OrderDetail orderDetail, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    OrderDetail insert(OrderDetail orderDetail);

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    OrderDetail update(OrderDetail orderDetail);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
