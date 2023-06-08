package cn.boot.ymw.cn.dao;


import cn.boot.ymw.cn.pojo.News;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (News)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-08 22:22:29
 */
@Mapper
public interface NewsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    News queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param news 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<News> queryAllByLimit(News news, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param news 查询条件
     * @return 总行数
     */
    long count(News news);

    /**
     * 新增数据
     *
     * @param news 实例对象
     * @return 影响行数
     */
    int insert(News news);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<News> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<News> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<News> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<News> entities);

    /**
     * 修改数据
     *
     * @param news 实例对象
     * @return 影响行数
     */
    int update(News news);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

