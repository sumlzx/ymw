package cn.boot.ymw.cn.service.orderDetail;


import cn.boot.ymw.cn.dao.OrderDetailDao;
import cn.boot.ymw.cn.pojo.OrderDetail;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (OrderDetail)表服务实现类
 *
 * @author makejava
 * @since 2023-06-08 22:23:20
 */
@Service("orderDetailService")
public class OrderDetailServiceImpl implements OrderDetailService {
    @Resource
    private OrderDetailDao orderDetailDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public OrderDetail queryById(Integer id) {
        return this.orderDetailDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param orderDetail 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<OrderDetail> queryByPage(OrderDetail orderDetail, PageRequest pageRequest) {
        long total = this.orderDetailDao.count(orderDetail);
        return new PageImpl<>(this.orderDetailDao.queryAllByLimit(orderDetail, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetail insert(OrderDetail orderDetail) {
        this.orderDetailDao.insert(orderDetail);
        return orderDetail;
    }

    /**
     * 修改数据
     *
     * @param orderDetail 实例对象
     * @return 实例对象
     */
    @Override
    public OrderDetail update(OrderDetail orderDetail) {
        this.orderDetailDao.update(orderDetail);
        return this.queryById(orderDetail.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.orderDetailDao.deleteById(id) > 0;
    }
}
