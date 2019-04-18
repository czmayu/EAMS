package com.dimple.evaluation.mapper;

import com.dimple.evaluation.domain.RecordHeader;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 评优评奖统计总表(RecordHeader)表数据库访问层
 *
 * @author makejava
 * @since 2019-04-18 14:16:03
 */
public interface EamsRecordHeaderMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param recHeaderId 主键
     * @return 实例对象
     */
    RecordHeader selectRecordHeaderById(Long recHeaderId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<RecordHeader> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param recordHeader 实例对象
     * @return 对象列表
     */
    List<RecordHeader> selectRecordHeaderList(RecordHeader recordHeader);

    /**
     * 新增数据
     *
     * @param recordHeader 实例对象
     * @return 影响行数
     */
    int insertRecordHeader(RecordHeader recordHeader);

    /**
     * 修改数据
     *
     * @param recordHeader 实例对象
     * @return 影响行数
     */
    int updateRecordHeader(RecordHeader recordHeader);

    /**
     * 通过主键删除数据
     *
     * @param recHeaderId 主键
     * @return 影响行数
     */
    int deleteRecordHeaderById(Long recHeaderId);

    /**
     * 通过主键批量删除数据
     *
     * @param ids 需要删除的数据的id
     * @return 影响行数
     */
    int deleteRecordHeaderByIds(Long[] ids);
}