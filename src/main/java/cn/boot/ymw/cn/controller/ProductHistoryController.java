package cn.boot.ymw.cn.controller;

import cn.boot.ymw.cn.pojo.ProductHistory;
import cn.boot.ymw.cn.service.productHistory.ProductHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (ProductHistory)表控制层
 *
 * @author makejava
 * @since 2023-06-08 22:53:33
 */
@RestController
@RequestMapping("productHistory")
public class ProductHistoryController {
    /**
     * 服务对象
     */
    @Resource
    private ProductHistoryService productHistoryService;

    /**
     * 分页查询
     *
     * @param productHistory 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<ProductHistory>> queryByPage(ProductHistory productHistory, PageRequest pageRequest) {
        return ResponseEntity.ok(this.productHistoryService.queryByPage(productHistory, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<ProductHistory> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.productHistoryService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param productHistory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<ProductHistory> add(ProductHistory productHistory) {
        return ResponseEntity.ok(this.productHistoryService.insert(productHistory));
    }

    /**
     * 编辑数据
     *
     * @param productHistory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<ProductHistory> edit(ProductHistory productHistory) {
        return ResponseEntity.ok(this.productHistoryService.update(productHistory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.productHistoryService.deleteById(id));
    }

}

