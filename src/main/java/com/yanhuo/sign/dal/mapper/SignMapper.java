package com.yanhuo.sign.dal.mapper;

import com.yanhuo.sign.dal.model.Sign;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SignMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long signId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int insert(Sign record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    Sign selectByPrimaryKey(Long signId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    List<Sign> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sign
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(Sign record);
}