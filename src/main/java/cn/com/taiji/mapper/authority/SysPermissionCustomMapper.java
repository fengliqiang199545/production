package cn.com.taiji.mapper.authority;

import cn.com.taiji.domain.authority.SysPermission;

import java.util.List;

public interface SysPermissionCustomMapper {

    //根据用户ID查询菜单
    public List<SysPermission> findMenuListByUserId(String userid) throws Exception;

    //根据用户ID查询url
    public String findPermissionByUserId(String userid) throws Exception;
}
