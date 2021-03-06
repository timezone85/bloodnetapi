package com.bloodnet.api.mappers;

import com.bloodnet.api.model.TblRelationStepfatherSon;
import com.bloodnet.api.model.TblRelationStepfatherSonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRelationStepfatherSonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    int countByExample(TblRelationStepfatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    int deleteByExample(TblRelationStepfatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    int insert(TblRelationStepfatherSon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    int insertSelective(TblRelationStepfatherSon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    List<TblRelationStepfatherSon> selectByExample(TblRelationStepfatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblRelationStepfatherSon record, @Param("example") TblRelationStepfatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_son
     *
     * @mbggenerated Fri Apr 07 18:35:46 JST 2017
     */
    int updateByExample(@Param("record") TblRelationStepfatherSon record, @Param("example") TblRelationStepfatherSonExample example);
}