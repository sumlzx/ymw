package cn.boot.ymw.cn.service.news;


import cn.boot.ymw.cn.pojo.News;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 * (News)表服务接口
 *
 * @author makejava
 * @since 2023-06-08 22:22:29
 */
public interface NewsService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    News queryById(Integer id);

    /**
     * 分页查询
     *
     * @param news 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    Page<News> queryByPage(News news, PageRequest pageRequest);

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    News insert(News news);

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    News update(News news);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}
