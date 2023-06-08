package cn.boot.ymw.cn.service.productHistory;

import cn.boot.ymw.cn.pojo.ProductHistory;
import cn.boot.ymw.cn.dao.ProductHistoryDao;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (ProductHistory)表服务实现类
 *
 * @author makejava
 * @since 2023-06-08 22:53:33
 */
@Service("productHistoryService")
public class ProductHistoryServiceImpl implements ProductHistoryService {
    @Resource
    private ProductHistoryDao productHistoryDao;

    /**
     * 通过ID查询单条数据
     *
     * @param hid 主键
     * @return 实例对象
     */
    @Override
    public ProductHistory queryById(Integer hid) {
        return this.productHistoryDao.queryById(hid);
    }

    /**
     * 分页查询
     *
     * @param productHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<ProductHistory> queryByPage(ProductHistory productHistory, PageRequest pageRequest) {
        long total = this.productHistoryDao.count(productHistory);
        return new PageImpl<>(this.productHistoryDao.queryAllByLimit(productHistory, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param productHistory 实例对象
     * @return 实例对象
     */
    @Override
    public ProductHistory insert(ProductHistory productHistory) {
        this.productHistoryDao.insert(productHistory);
        return productHistory;
    }

    /**
     * 修改数据
     *
     * @param productHistory 实例对象
     * @return 实例对象
     */
    @Override
    public ProductHistory update(ProductHistory productHistory) {
        this.productHistoryDao.update(productHistory);
        return this.queryById(productHistory.getHid());
    }

    /**
     * 通过主键删除数据
     *
     * @param hid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer hid) {
        return this.productHistoryDao.deleteById(hid) > 0;
    }
}
