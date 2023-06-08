package cn.boot.ymw.cn.service.productCollection;


import cn.boot.ymw.cn.dao.ProductCollectionDao;
import cn.boot.ymw.cn.pojo.ProductCollection;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ProductCollection)表服务实现类
 *
 * @author makejava
 * @since 2023-06-08 22:53:32
 */
@Service("productCollectionService")
public class ProductCollectionServiceImpl implements ProductCollectionService {
    @Resource
    private ProductCollectionDao productCollectionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    @Override
    public ProductCollection queryById(Integer cid) {
        return this.productCollectionDao.queryById(cid);
    }

    /**
     * 分页查询
     *
     * @param productCollection 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductCollection> queryByPage(ProductCollection productCollection, PageRequest pageRequest) {
        long total = this.productCollectionDao.count(productCollection);
        return new PageImpl<>(this.productCollectionDao.queryAllByLimit(productCollection, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productCollection 实例对象
     * @return 实例对象
     */
    @Override
    public ProductCollection insert(ProductCollection productCollection) {
        this.productCollectionDao.insert(productCollection);
        return productCollection;
    }

    /**
     * 修改数据
     *
     * @param productCollection 实例对象
     * @return 实例对象
     */
    @Override
    public ProductCollection update(ProductCollection productCollection) {
        this.productCollectionDao.update(productCollection);
        return this.queryById(productCollection.getCid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cid) {
        return this.productCollectionDao.deleteById(cid) > 0;
    }
}
