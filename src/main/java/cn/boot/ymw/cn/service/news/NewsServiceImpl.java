package cn.boot.ymw.cn.service.news;


import cn.boot.ymw.cn.dao.NewsDao;
import cn.boot.ymw.cn.pojo.News;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (News)表服务实现类
 *
 * @author makejava
 * @since 2023-06-08 22:22:29
 */
@Service("newsService")
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsDao newsDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public News queryById(Integer id) {
        return this.newsDao.queryById(id);
    }

    /**
     * 分页查询
     *
     * @param news 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @Override
    public Page<News> queryByPage(News news, PageRequest pageRequest) {
        long total = this.newsDao.count(news);
        return new PageImpl<>(this.newsDao.queryAllByLimit(news, pageRequest), pageRequest, total);
    }

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public News insert(News news) {
        this.newsDao.insert(news);
        return news;
    }

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 实例对象
     */
    @Override
    public News update(News news) {
        this.newsDao.update(news);
        return this.queryById(news.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.newsDao.deleteById(id) > 0;
    }
}
