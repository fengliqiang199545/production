package cn.com.taiji.mapper;

import cn.com.taiji.domain.DeviceType;
import cn.com.taiji.domain.DeviceTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    long countByExample(DeviceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByExample(DeviceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByPrimaryKey(String deviceTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insert(DeviceType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insertSelective(DeviceType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    List<DeviceType> selectByExample(DeviceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    DeviceType selectByPrimaryKey(String deviceTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExample(@Param("record") DeviceType record, @Param("example") DeviceTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKeySelective(DeviceType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device_type
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKey(DeviceType record);
}