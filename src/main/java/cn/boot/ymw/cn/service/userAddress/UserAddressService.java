package cn.boot.ymw.cn.service.userAddress;


import cn.boot.ymw.cn.pojo.UserAddress;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (UserAddress)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:24:13
 */
public interface UserAddressService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserAddress queryById(Integer id);

    /**
     * 分页查询
     *
     * @param userAddress 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<UserAddress> queryByPage(UserAddress userAddress, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param userAddress 实例对象
     * @return 实例对象
     */
    UserAddress insert(UserAddress userAddress);

    /**
     * 修改数据
     *
     * @param userAddress 实例对象
     * @return 实例对象
     */
    UserAddress update(UserAddress userAddress);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
