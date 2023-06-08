package cn.boot.ymw.cn.dao;


import cn.boot.ymw.cn.pojo.ProductCategory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (ProductCategory)表数据库访问层
 *
 * @author makejava
 * @since 2023-06-08 22:23:44
 */
@Mapper
public interface ProductCategoryDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    ProductCategory queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param productCategory 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<ProductCategory> queryAllByLimit(ProductCategory productCategory, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param productCategory 查询条件
     * @return 总行数
     */
    long count(ProductCategory productCategory);

    /**
     * 新增数据
     *
     * @param productCategory 实例对象
     * @return 影响行数
     */
    int insert(ProductCategory productCategory);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductCategory> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<ProductCategory> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<ProductCategory> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<ProductCategory> entities);

    /**
     * 修改数据
     *
     * @param productCategory 实例对象
     * @return 影响行数
     */
    int update(ProductCategory productCategory);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}

