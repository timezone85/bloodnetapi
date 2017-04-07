package com.bloodnet.api.mappers;

import com.bloodnet.api.model.TblRelationFatherSon;
import com.bloodnet.api.model.TblRelationFatherSonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TblRelationFatherSonMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    int countByExample(TblRelationFatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    int deleteByExample(TblRelationFatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    int insert(TblRelationFatherSon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    int insertSelective(TblRelationFatherSon record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    List<TblRelationFatherSon> selectByExample(TblRelationFatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    int updateByExampleSelective(@Param("record") TblRelationFatherSon record, @Param("example") TblRelationFatherSonExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_relation_father_son
     *
     * @mbggenerated Fri Apr 07 16:00:20 JST 2017
     */
    int updateByExample(@Param("record") TblRelationFatherSon record, @Param("example") TblRelationFatherSonExample example);
}