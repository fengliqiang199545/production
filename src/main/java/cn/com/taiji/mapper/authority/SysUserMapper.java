package cn.com.taiji.mapper.authority;

import cn.com.taiji.domain.authority.SysUser;
import cn.com.taiji.domain.authority.SysUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysUserMapper {
	//扩展的mapper接口方法
	List<SysUser> find(SysUser record);
	
	int deleteBatch(String[] ids);
	
	int changeStatus(String[] ids);
	
	
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysUser user);

    int insertSelective(SysUser user);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser user);

    int updateByPrimaryKey(SysUser user);

	List<SysUser> searchUserByUserId(String userId);

	List<SysUser> searchUserByUserName(String userName);

	List<SysUser> searchUserByRoleName(String roleName);
}