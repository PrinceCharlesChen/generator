package cn.zjhf.tool.quicker.dto;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import java.util.List;

/**
 * 数据库表信息
 *
 * @author lutiehua
 * @date 2017/11/9.
 */
@Data
public class TableInfo {

    /**
     * 名称
     */
    @NotBlank
    private String name;

    /**
     * 注释
     */
    private String remark;

    /**
     * 表类型
     *
     * Single：独立表
     * SubTable：子表
     */
    @NotBlank
    private String type;

    /**
     * 主键字段名称
     */
    @NotBlank
    private String key;

    /**
     * 主键类型
     *
     * ID：主键是自增ID（Long）
     * UUID：主键是UUID（String）
     *
     */
    @NotBlank
    private String keyType;

    /**
     * 连接表
     */
    private String main;

    /**
     * 连接字段
     */
    private String join;

    /**
     * 查询字段
     */
    private List<String> query;

    /**
     * 排序字段
     */
    private List<OrderByInfo> order;
}
