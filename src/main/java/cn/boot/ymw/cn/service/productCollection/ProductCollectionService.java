package cn.boot.ymw.cn.service.productCollection;


import cn.boot.ymw.cn.pojo.ProductCollection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (ProductCollection)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:53:32
 */
public interface ProductCollectionService {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    ProductCollection queryById(Integer cid);

    /**
     * 分页查询
     *
     * @param productCollection 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<ProductCollection> queryByPage(ProductCollection productCollection, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param productCollection 实例对象
     * @return 实例对象
     */
    ProductCollection insert(ProductCollection productCollection);

    /**
     * 修改数据
     *
     * @param productCollection 实例对象
     * @return 实例对象
     */
    ProductCollection update(ProductCollection productCollection);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cid);

}
