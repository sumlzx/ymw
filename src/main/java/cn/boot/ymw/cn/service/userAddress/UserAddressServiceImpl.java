package cn.boot.ymw.cn.service.userAddress;


import cn.boot.ymw.cn.dao.UserAddressDao;
import cn.boot.ymw.cn.pojo.UserAddress;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (UserAddress)表服务实现类
 *
 * @author makejava
 * @since 2023-06-08 22:24:13
 */
@Service("userAddressService")
public class UserAddressServiceImpl implements UserAddressService {
    @Resource
    private UserAddressDao userAddressDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserAddress queryById(Integer id) {
        return this.userAddressDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param userAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<UserAddress> queryByPage(UserAddress userAddress, PageRequest pageRequest) {
        long total = this.userAddressDao.count(userAddress);
        return new PageImpl<>(this.userAddressDao.queryAllByLimit(userAddress, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param userAddress 实例对象
     * @return 实例对象
     */
    @Override
    public UserAddress insert(UserAddress userAddress) {
        this.userAddressDao.insert(userAddress);
        return userAddress;
    }

    /**
     * 修改数据
     *
     * @param userAddress 实例对象
     * @return 实例对象
     */
    @Override
    public UserAddress update(UserAddress userAddress) {
        this.userAddressDao.update(userAddress);
        return this.queryById(userAddress.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.userAddressDao.deleteById(id) > 0;
    }
}
