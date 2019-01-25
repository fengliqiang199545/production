package cn.com.taiji.mapper;

import cn.com.taiji.domain.FinalMeasuretCheck;
import cn.com.taiji.domain.FinalMeasuretCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinalMeasuretCheckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    long countByExample(FinalMeasuretCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByExample(FinalMeasuretCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByPrimaryKey(String fMeasureCheckId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insert(FinalMeasuretCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insertSelective(FinalMeasuretCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    List<FinalMeasuretCheck> selectByExample(FinalMeasuretCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    FinalMeasuretCheck selectByPrimaryKey(String fMeasureCheckId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") FinalMeasuretCheck record, @Param("example") FinalMeasuretCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExample(@Param("record") FinalMeasuretCheck record, @Param("example") FinalMeasuretCheckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKeySelective(FinalMeasuretCheck record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table final_measuret_check
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKey(FinalMeasuretCheck record);
}