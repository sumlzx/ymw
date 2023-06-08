package cn.boot.ymw.cn.controller;


import cn.boot.ymw.cn.pojo.ProductCollection;
import cn.boot.ymw.cn.service.productCollection.ProductCollectionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProductCollection)表控制层
 *
 * @author makejava
 * @since 2023-06-08 22:53:32
 */
@RestController
@RequestMapping("productCollection")
public class ProductCollectionController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCollectionService productCollectionService;

    /**
     * 分页查询
     *
     * @param productCollection 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ProductCollection>> queryByPage(ProductCollection productCollection, PageRequest pageRequest) {
        return ResponseEntity.ok(this.productCollectionService.queryByPage(productCollection, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ProductCollection> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.productCollectionService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param productCollection 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ProductCollection> add(ProductCollection productCollection) {
        return ResponseEntity.ok(this.productCollectionService.insert(productCollection));
    }

    /**
     * 编辑数据
     *
     * @param productCollection 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ProductCollection> edit(ProductCollection productCollection) {
        return ResponseEntity.ok(this.productCollectionService.update(productCollection));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.productCollectionService.deleteById(id));
    }

}

