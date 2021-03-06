package cn.com.taiji.mapper;

import cn.com.taiji.domain.MaterialConsume;
import cn.com.taiji.domain.MaterialConsumeExample;
import java.util.List;

import cn.com.taiji.domain.vo.MaterialConsumeVO;
import org.apache.ibatis.annotations.Param;

public interface MaterialConsumeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    long countByExample(MaterialConsumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByExample(MaterialConsumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int deleteByPrimaryKey(String consumeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insert(MaterialConsume record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int insertSelective(MaterialConsume record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    List<MaterialConsume> selectByExample(MaterialConsumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    MaterialConsume selectByPrimaryKey(String consumeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExampleSelective(@Param("record") MaterialConsume record, @Param("example") MaterialConsumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByExample(@Param("record") MaterialConsume record, @Param("example") MaterialConsumeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKeySelective(MaterialConsume record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table material_consume
     *
     * @mbg.generated Fri Jan 25 11:46:10 CST 2019
     */
    int updateByPrimaryKey(MaterialConsume record);

    //扩展的mapper接口方法
    int deleteBatch(String[] ids);

    int updateNote(MaterialConsume materialConsume);

    List<MaterialConsumeVO> find(MaterialConsumeVO materialConsume);

    List<MaterialConsumeVO> searchMaterialConsumeByConsumeId(String consumeId);

    List<MaterialConsumeVO> searchMaterialConsumeByMaterialId(String materialId);

    List<MaterialConsumeVO> searchMaterialConsumeByWorkId(String workId);

}