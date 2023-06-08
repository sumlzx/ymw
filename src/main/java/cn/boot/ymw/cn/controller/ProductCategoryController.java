package cn.boot.ymw.cn.controller;


import cn.boot.ymw.cn.pojo.ProductCategory;
import cn.boot.ymw.cn.service.productCategory.ProductCategoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProductCategory)表控制层
 *
 * @author makejava
 * @since 2023-06-08 22:23:44
 */
@RestController
@RequestMapping("productCategory")
public class ProductCategoryController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryService productCategoryService;

    /**
     * 分页查询
     *
     * @param productCategory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ProductCategory>> queryByPage(ProductCategory productCategory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.productCategoryService.queryByPage(productCategory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ProductCategory> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.productCategoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param productCategory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ProductCategory> add(ProductCategory productCategory) {
        return ResponseEntity.ok(this.productCategoryService.insert(productCategory));
    }

    /**
     * 编辑数据
     *
     * @param productCategory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ProductCategory> edit(ProductCategory productCategory) {
        return ResponseEntity.ok(this.productCategoryService.update(productCategory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.productCategoryService.deleteById(id));
    }

}

