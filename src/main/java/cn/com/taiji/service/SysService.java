package cn.com.taiji.service;

import cn.com.taiji.domain.authority.SysPermission;
import cn.com.taiji.domain.authority.SysUser;

import java.util.List;

/*
*   认证授权服务接口
* */
public interface SysService {
    SysUser getSysUserByName(String username) throws Exception;

    List<SysPermission> findMenuListByUserId(String userId) throws Exception;

    List<SysPermission> findPermissionListByUserId(String userId)throws Exception;
}
