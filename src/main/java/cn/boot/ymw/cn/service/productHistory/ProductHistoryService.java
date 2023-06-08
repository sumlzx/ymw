package cn.boot.ymw.cn.service.productHistory;

import cn.boot.ymw.cn.pojo.ProductHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ProductHistory)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:53:33
 */
public interface ProductHistoryService {

    /**
     * 通过ID查询单条数据
     *
     * @param hid 主键
     * @return 实例对象
     */
    ProductHistory queryById(Integer hid);

    /**
     * 分页查询
     *
     * @param productHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductHistory> queryByPage(ProductHistory productHistory, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productHistory 实例对象
     * @return 实例对象
     */
    ProductHistory insert(ProductHistory productHistory);

    /**
     * 修改数据
     *
     * @param productHistory 实例对象
     * @return 实例对象
     */
    ProductHistory update(ProductHistory productHistory);

    /**
     * 通过主键删除数据
     *
     * @param hid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer hid);

}
