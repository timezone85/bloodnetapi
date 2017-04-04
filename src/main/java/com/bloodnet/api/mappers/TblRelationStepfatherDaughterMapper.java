package com.bloodnet.api.mappers;

import com.bloodnet.api.model.TblRelationStepfatherDaughter;
import com.bloodnet.api.model.TblRelationStepfatherDaughterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRelationStepfatherDaughterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    int countByExample(TblRelationStepfatherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    int deleteByExample(TblRelationStepfatherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    int insert(TblRelationStepfatherDaughter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    int insertSelective(TblRelationStepfatherDaughter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    List<TblRelationStepfatherDaughter> selectByExample(TblRelationStepfatherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblRelationStepfatherDaughter record, @Param("example") TblRelationStepfatherDaughterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_stepfather_daughter
     *
     * @mbggenerated Tue Apr 04 22:24:13 JST 2017
     */
    int updateByExample(@Param("record") TblRelationStepfatherDaughter record, @Param("example") TblRelationStepfatherDaughterExample example);
}