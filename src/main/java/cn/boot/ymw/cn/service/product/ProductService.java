package cn.boot.ymw.cn.service.product;


import cn.boot.ymw.cn.pojo.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (Product)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:23:31
 */
public interface ProductService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Product queryById(Integer id);

    /**
     * 分页查询
     *
     * @param product 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<Product> queryByPage(Product product, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product insert(Product product);

    /**
     * 修改数据
     *
     * @param product 实例对象
     * @return 实例对象
     */
    Product update(Product product);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
