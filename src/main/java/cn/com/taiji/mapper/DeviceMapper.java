package cn.com.taiji.mapper;

import cn.com.taiji.domain.Device;
import cn.com.taiji.domain.DeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    long countByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByPrimaryKey(String deviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insert(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insertSelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    List<Device> selectByExample(DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    Device selectByPrimaryKey(String deviceId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExample(@Param("record") Device record, @Param("example") DeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKeySelective(Device record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table device
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKey(Device record);

//    自定义mapper接口

    List<Device> find(Device device);

    List<Device> getData();

    int deleteBatch(String[] deviceIds);

    int updateNote(Device device);

    List<Device> searchDeviceByDeviceId(String deviceId);

    List<Device> searchDeviceByDeviceName(String deviceName);

    List<Device> searchDeviceByDeviceTypeName(String deviceTypeName);
}