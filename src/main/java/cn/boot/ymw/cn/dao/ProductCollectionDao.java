package cn.boot.ymw.cn.dao;


import cn.boot.ymw.cn.pojo.ProductCollection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (ProductCollection)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-08 22:53:32
 */
@Mapper
public interface ProductCollectionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param cid 主键
     * @return 实例对象
     */
    ProductCollection queryById(Integer cid);

    /**
     * 查询指定行数据
     *
     * @param productCollection 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ProductCollection> queryAllByLimit(ProductCollection productCollection, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param productCollection 查询条件
     * @return 总行数
     */
    long count(ProductCollection productCollection);

    /**
     * 新增数据
     *
     * @param productCollection 实例对象
     * @return 影响行数
     */
    int insert(ProductCollection productCollection);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductCollection> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductCollection> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductCollection> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductCollection> entities);

    /**
     * 修改数据
     *
     * @param productCollection 实例对象
     * @return 影响行数
     */
    int update(ProductCollection productCollection);

    /**
     * 通过主键删除数据
     *
     * @param cid 主键
     * @return 影响行数
     */
    int deleteById(Integer cid);

}

