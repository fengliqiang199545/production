package cn.com.taiji.mapper;

import cn.com.taiji.domain.MaterialReceive;
import cn.com.taiji.domain.MaterialReceiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialReceiveMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    long countByExample(MaterialReceiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByExample(MaterialReceiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByPrimaryKey(String receiveId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insert(MaterialReceive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insertSelective(MaterialReceive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    List<MaterialReceive> selectByExample(MaterialReceiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    MaterialReceive selectByPrimaryKey(String receiveId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") MaterialReceive record, @Param("example") MaterialReceiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExample(@Param("record") MaterialReceive record, @Param("example") MaterialReceiveExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKeySelective(MaterialReceive record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_receive
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKey(MaterialReceive record);
}